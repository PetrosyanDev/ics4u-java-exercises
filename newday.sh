#!/usr/bin/env bash
set -euo pipefail

DATE_IN="${1:-today}"
COUNT="${2:-3}"

# parse date
if [[ "$DATE_IN" == "today" ]]; then
  Y=$(date +%Y)
  M=$(date +%m)
  D=$(date +%d)
  DATE_US=$(date +%m/%d/%Y)
else
  if ! date -j -f "%Y-%m-%d" "$DATE_IN" >/dev/null 2>&1; then
    echo "Use format YYYY-MM-DD" >&2
    exit 1
  fi
  Y=$(date -j -f "%Y-%m-%d" "$DATE_IN" +%Y)
  M=$(date -j -f "%Y-%m-%d" "$DATE_IN" +%m)
  D=$(date -j -f "%Y-%m-%d" "$DATE_IN" +%d)
  DATE_US=$(date -j -f "%Y-%m-%d" "$DATE_IN" +%m/%d/%Y)
fi

BASE="src/main/java/exercises"
mkdir -p "$BASE"
PKG="d${Y}_${M}_${D}"
DIR="${BASE}/${PKG}"
mkdir -p "$DIR"

HEADER="/*
 * Student: © Erik Petrosyan
 * Date: ${DATE_US}
 */"

for i in $(seq -f "%02g" 1 "$COUNT"); do
  CLASS="Exercise${i}"
  FILE="${DIR}/${CLASS}.java"
  if [[ -f "$FILE" ]]; then
    echo "Skip (exists): $FILE"
    continue
  fi
  cat > "$FILE" <<EOF
${HEADER}

package exercises.${PKG};

public class ${CLASS} {
    public static void main(String[] args) {
        System.out.println("${CLASS} - ${DATE_US}");
    }
}
EOF
  echo "Created ${FILE}"
done
