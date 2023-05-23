#### What is Docker ?
- Docker is open-source centralized platform design to create, deploy and run the applications.
- Docker uses container on the host O.S. to run the applications.
- It allows to use same linux kernel as system on the host O.S. rather than rather than creating new virtual O.S.
- We can install docker on any O.S. but Docker Engine run natively on Linux Distribution.
- Docker written in 'Go' language.
- Docker is a tool that performs O.S. level virtualization, also known as **containerization**.  
- Before docker many users face the problem that a particular code is running on developers system but not in user system.
- Docker was first release in March 2013. It is developed by Solomon Hykes and Sebastion Pahl.
- Docker is set of platform as a service that uses O.S. level virtualization whereas VMware use hardware level virtualization.

#### Advantages of Docker 
- No pre-allocation of RAM.
- Continuous Integration Efficiency : Docker enables you to build a container image and reuse that same image across every step of the deployment process.
- less cost
- it is light weight
- It can be run on physical hardware OR virtual hardware OR on cloud.
- You can reuse the image.
- It took very less time to create the container.

#### Disadvantages of Docker 
- Docker is not good solution for applications that required rich GUI.
- It is Difficult to manage if large amount of containers is there.
- Docker does not provide cross platform compatibility means if an application is design to run in docker container on windows then it can not run on linux or vice vera.
- Docker is suitable when the development O.S. and testing O.S. are same if O.S. is different the we should use VM.
- No solution for data recovery and backup.

#### Architecture of Docker 
- Developer --> Docker file --> Docker Engine --> Image --> container (layered file system) --> image --> Docker Hub 

#### Docker Ecosystem
**1. Docker Daemon or Docker Server or Docker Engine**
   - Docker Daemon runs on host O.S. 
   - It is responsible for running containers to manages docker services.
   - Docker daemon can communicate with other daemons.
  
**2. Docker Client**
   - Docker users can interact with docker daemon through client.
   - Docker client uses commands and REST API's to communicate with the docker daemon.
   - When a client server runs any server command on docker client terminal, the client terminal sends these docker command to docker daemon.
   - It is possible to docker client to communicate more than one docker daemon.

**3. Docker Host**
   - Docker Host is used to provide an environment to execute and run the applications.
   - It contains the docker daemon, images, containers, network and storages. 

**4. Docker Hub/Registry**
   - Docker Hub/Registry manages and stores the docker images.
   - There are two types of registry in docker 
   - a) Public Repository : It is open for all public.
   - b) Private Repository : It is used for enterprise level.

**5. Docker Images**
   - Docker images are the read only binary templates used to create the docker containers.
   - It is single file contains all dependencies and configuration required to run the container.

**6. Docker Container**
   - Docker Container holds the entire package that is needs to run the application.
   - Container is like Virtual Machine.
   - Image becomes the container when they run on docker engine.
   - We can modify in container but can not modify in image.

**7. Docker Compose**

#### Ways to create an Image 
1. Take the image from docker hub.
2. Create an image form docker file.
3. Create an image from existing docker container. 


#### What is Docker Engine ?

#### What is Docker Hub ?

#### What is Container ?

#### What is Image ?  

#### What is Docker File ?

#### What is difference between Containers And VM (Virtual Machine) ?


#### Frequently Used Docker Commands :
1) $ docker images
- To see all the images present in your local machine.

2) $ docker search jenkins 
- To find out image in docker hub 

3) $ docker pull jenkins 
- To download image from docker hub to local machine.

4) $ docker run -it --name <user_image_name> <pull_image_name> /bin/bash
- To pull, run and given user name to image

5) $ service docker status
- To check service is start or not

6) $ docker start <container_name>
- To start container

7) $ docker attach <container_name>
- To go inside container

8) $ docker ps -a
- To see all running as well as stops containers 
- (ps: process status, -a: all)

9) $ docker ps
- To see only running containers

10) $ docker stop <container_name>
- To stop the container

11) $ docker rm <container_name>
- To delete the container 

**Note :**
- If docker is not installed then we need to install by using following command 
- $ sudo yum install docker -y 


#### Docker Hands On :
1) $ sudo su
- To become root user

2) $ yum update -y
- To update the existing packages

3) $ which docker 
- To see docker installed file 

4) $ docker -v / $ docker --version
- To check docker version 

5) $ service docker status 
- To check docker service status 

6) $ docker info
- To check docker info (docker is running or not)

7) $ service docker start
- To start the docker

8) $ docker images
- To see all the images present in your local machine.

9) $ docker ps
- To see only running containers

10) $ docker ps -a
- To see all running as well as stops containers 
- (ps: process status, -a: all)

11) $ docker run -it ubuntu /bin/bash
- Pull the image from docker hub and run it 

12) $ cat /etc/os-release
- To check info of O.S. 

13) $ exit 
- To come out from container.

14) $ docker pull jenkins/jenkins:lts-jdk11
- To pull the image from docker hub and kept it in local.

15) $ docker search ubuntu
- To search the docker image from the local

16) $ docker run -it --name <container_name> <image_name> /bin/bash
- To pull the container, give custom name to container and run it

17) $ docker start <container_name>
- To start the container 

18) $ docker attach <container_name>
- To go inside given container 

19) $ docker stop <container_name>
- To stop the container 

20) $ docker rm <container_name>
- To delete the given container

#### Steps To Create Custom Docker Image 
1) Login to your AWS account and start your EC2 instance.

2) Pull the image from DockerHub and run as container by giving name
- $ docker run -it --name <container_name> <image_name> /bin/bash

3) Go to /temp directory
- $ cd /temp

4) Now create one file inside this temp directory 
- $ touch myfile

5) Now if you want to see the difference between the base image and changes in it then
- $ docker diff <container_name> 

```
Output :
   C  /root
   A  /root/.bash_history
   C  /temp
   A  /temp/myfile
   D

   whereas, C = change, A = append or addition, D = delete 
```

6) Now create image from this container 
- $ docker commit <container_name> <image_name>

7) Check the images 
- $ docker images 

8) Now create container from this image
- $ docker run -it --name <container_name> <image_name> /bin/bash


#### Hands On Lab :
1) $ sudo su
2) # service docker status
3) # service docker start 
4) # docker run --name ubuntu-container1 -it ubuntu /bin/bash
5) # ls
6) # cd /tmp
7) # touch file1
8) # exit 
9) # docker diff ubuntu-container1 
10) # docker commit ubuntu-container1 updated_image_ubuntu
11) # docker images
12) # docker run --name updated_ubuntu_container -it updated_image_ubuntu /bin/bash
13) # ls
14) # cd /tmp
15) # ls
16) # exit
   
#### Docker File and It's Components 
**Dockerfile**
- Dockerfile is basically text file which contains some set of instructions.
- It used in automation of docker image creation.

**FROM**
- For base image
- This command must be top of the Dockerfile.

**RUN**
- To execute commands, it will create layer image.

**MAINTAINER**
- Author/Owner/Description

**COPY**
- Copy files from local system (docker VM) We need to provide source, destination (We can not download files from internet and any remote repo)

**ADD**
- Similar to COPY but it provides the feature to download files from internet, also this file will extracted docker image side.

**EXPOSE**
- To expose the ports such as port 8080 for tomcat, port 80 for nginx.

**WORKDIR**
- To set working directory for container.

**CMD**
- Execute commands but during container creation.

**ENTRYPOINT**
- It is similar to CMD but having higher priority than CMD.
- First command executed by ENTRYPOINT only.

**ENV**
- Environment variables

**ARG**
- ARG <variable_name>[=<default_value>]
- Here are some use cases Setting build-time variables, Conditional builds, Passing values during build.

#### Steps to create container from image of Dockerfile
1) Create fille name as Dockerfile
- $ vi Dockerfile
  
2) Add instructions in Dockerfile
```
FROM ubuntu
RUN echo "Hello World" > /tmp/file2
```

3) Build Dockerfile to create an image
- $ docker build -t <image_name> .
- '-t' for tag
- '.' for current working directory 
<br>
- $ docker ps -a
- $ docker images 
  
4) Run image to create container
- $ docker run --name <container_name> -it <image_name> /bin/bash
- $ cat /tmp/file2

#### Hands On Lab :
1) $ sudo su
2) $ pwd
3) $ vi Dockerfile
4) press i
5) Write  
```
FROM ubuntu
RUN echo "Hello World" > /tmp/file2
```
6) press Esc and :wq
7) $ ls
8) $ docker build -t ubuntu_dockerfile-image .
9) $ docker images
10) $ docker run --name ubuntu_dockerfile-image-container -it ubuntu_dockerfile-image /bin/bash
11) # cd /tmp
12) # ls
13) # cat file2
14) # exit

#### Hands On Lab :
1) # vi Dockerfile
2) press i
3) write the below script
   ```
   FROM ubuntu
   WORKDIR /tmp
   RUN echo "Hi, my name is Indrajit" > /tmp/testfile3
   ENV myname indrajitranananavare
   COPY testfile1 /tmp
   ADD test.tar.gz /tmp
   ```
4) press Esc and :wq
5) # touch testfile1
6) # ls
7) # touch test
8) # ls
9) # tar -cvf test.tar test
10) # ls
11) # gzip test.tar
12) # ls
13) # rm -rf test
14) # ls
15) # docker build new-dfi-ubuntu .













