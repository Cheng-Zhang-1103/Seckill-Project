[Demonstration](https://drive.google.com/file/d/17UmEyb_7AfsdKj5wbV2a3qGk6OTtDsdC/view)

[Report](./FinalTeamTemplate.pdf)


# technology stack

- **Java 8**
- **Springboot**
- **RabbitMQ**
- **Redis**
- **Mysql**
- **Mybatis Plus**
- **swagger**
- **lombok**

# Getting start

### Installation & run

1. create docker container for RabbitMQ

   ```shell
   # latest RabbitMQ 3.11
   docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.11-management
   ```

   

2. create docker container for redis

   ```shell
   docker run -d -p 6379:6379 --name redis_test --network redisnet redis
   ```

3. download the project and open the yml configuration file, the redis port number, rabbitMq port number, and mysql-related configuration according to your computer to modify

2. create mysql table and add data according to sqldoc in the file

3. enter the SeckillDemoApplication class to start the project



# Features

**Login Page**

![](readme_imgs/1.jpg)
**Goods List**

![](readme_imgs/2.jpg)

**Click detial to enter the seckill**

![](readme_imgs/3.jpg)

**Seckill Success**

![](readme_imgs/4.jpg)

**Generate order**

![](readme_imgs/5.jpg)

# Related error display

**The user has already bought it will prompt an error**

![](readme_imgs/6.jpg)

**Captcha input error**

![](readme_imgs/7.jpg)

# Member

**Boshen Fan**

**Qiyan Xuan**

**Cheng Zhang**

**Xing Liu**

