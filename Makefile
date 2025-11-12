SHELL := /bin/bash

.PHONY: new new-date

# create today's package with 3 exercises.
new:
	./newday.sh today 3

# usage: make new-date DATE=2025-09-16 COUNT=5
new-date:
	./newday.sh $(DATE) $(COUNT)
