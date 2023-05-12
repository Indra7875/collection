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







