FROM ubuntu:20.04
RUN apt-get update && \
apt-get install -y nmap\
--no-install-recommends && \
rm -rf /var/lib/apt/lists/*

COPY --chown=root:root ./script.sh /usr/local/bin/script.sh

LABEL org.opencontainers.image.authors="Irineu silva"