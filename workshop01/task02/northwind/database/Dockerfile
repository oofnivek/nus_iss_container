FROM mysql:8

ENV MYSQL_ROOT_PASSWORD=changeit MYSQL_DATABASE=northwind 

ADD 0-northwind-default-current-timestamp.sql /docker-entrypoint-initdb.d
ADD 1-northwind-data.sql /docker-entrypoint-initdb.d

EXPOSE 3306
VOLUME /var/lib/mysql

