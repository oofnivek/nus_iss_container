ARG NODE_VERSION=22.7.0-alpine3.20
FROM node:${NODE_VERSION}

## How to build

# create a directory /app and cd /app
WORKDIR /app

# Inside /app
# Copy my src

# Copy from local to container
COPY main.js .
COPY package-lock.json .
COPY package.json .
COPY public public
COPY views views

# install node modules
RUN npm ci

## How to run
ENV APP_PORT=3000

# Whare are the exposed port
EXPOSE ${APP_PORT}

# Run the application
ENTRYPOINT node main
