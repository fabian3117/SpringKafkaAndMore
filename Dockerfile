FROM ubuntu:latest
LABEL authors="fgonzalez@corp.sportclub.com.ar"

ENTRYPOINT ["top", "-b"]