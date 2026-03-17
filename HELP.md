# Getting Started
 
POS WMC Project for Back- and Frontend

```
docker exec -it postgres psql -U postgres -d postgres -c "CREATE DATABASE _2526_4dpos_vibecheck"
```
# Docker

10029  mvn clean
10031  ./mvnw -DskipTests package
10032  cp Docker/Dockerfile target/
10033  docker build --tag pos-backend ./target

10037  docker network create pos-syp
10051  docker run -p 5432:5432 -d --name postgres --network pos-syp -e POSTGRES_PASSWORD=postgres postgres:16-alpine
10054  docker exec -it postgres psql -U postgres -d postgres -c "CREATE DATABASE _2526_4dPOS_vibecheck"

10055  docker run -p 8080:8080 --network pos-syp pos-backend:latest
10056  docker ps -a

# Docker 260317

~~10033  docker build --tag pos-backend ./target~~

docker build --tag ghcr.io/schatel/backend:latest ./target

--tag:   `ghcr.io` -> URL of docker registry
            `schtl` -> username github
            `backend` -> image name
            `:latest` -> image version

## login @ github

+ open the github.com page, login and:
  + profile_picture / Settings / Developer Settings / Personal access tokens - classic Token

`docker login ghcr.io`

```
Authenticating with existing credentials... [Username: schtl]
Info → To login with a different account, run 'docker logout' followed by 'docker login'
Login Succeeded
```

docker pull ghcr.io/schtl/poswmc_4d:latest

## gh action - DIY

