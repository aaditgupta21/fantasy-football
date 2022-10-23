---
layout: default
---

<div id="video_wrapper">
  <video autoplay loop>
    <source src="https://drive.google.com/uc?export=view&id=1tfZ3a_LWyeRbDklc5UfDEZ99bD3fmaua" type="video/mp4">
  </video>
</div>

# Project Week 2

# API Frontend to Backend Overview
(Show demo of work in progress.)

## Must use API across multiple systems

### 1. Create a HTML Frontend table or view fetching from Backend using an Spring API

```

```
### 2, Show writing to Database

```

```


# Scrum Master
(Describe Program Purpose and Function. Also, highlight key system used to track, collaborate and review software.)

## Identify and Apply a Software Development process.

### 1. Describe your Software Development Life Cycle
(The software development life cycle is a process of planning, creating, testing, and deploying information systems across hardware and software)
planning: Leaders of the project evaluate the terms of the project, including the calculation of labor and material costs, to create a timetable with goals. Planning must also include areas of feedback from stakeholders or anybody who is going to benefit from the applications. The scope of the project should be clearly defined, the purpose of the application outlined, and the boundaries that are needed to keep the project from expanding beyond scope or shifting.

```
Planning:
Creating:
Testing:
Deploying information systems:

```

### 2. Describe how you plan, track sprints, track features, track milestones, and assign versions.

```

```

### 3. Highlight Agile process: research, design, coding, testing, review, repeat.
(What is Agile: The agile methodology focuses strongly on user input and experience, which can solve many issues that arose from older applications that were more cumbersome to use. The software, as it moves through the agile process, is very responsive to feedback and works to release software in quicker cycles in order to adhere to a changing and rapid market.)

```

```


## Define and analyze systems and software requirements.

### 1. Define Computer Systems you will develop.

```

```

### 2. Indicate Tools or Automation you will use improve tracking requirements.

```

```

### 3. Define strategies that enable Team to target the specific needs of the customer (ie Product Owner)meetings, demos, and collecting feedback.

```

```

## Test and Demo Software during each Sprint

### 1. Consider using GitHub Issues to support this process.

```

```

### 2. Develop and describe expectations of each feature.

```

```

### 3. Use feature, expected outcome, and the minimal amount of code each feature.

```

```

### 4. Document accomplishment with tangible evidence.

```

```

### 5. Have feature reviews, demos, and obtain feedback (team and/or customer)

```

```

### 6. Update and derive new features and tasks for next step in Software Development Life Cycle

```

```
(Mr.M suggestion is this person helps with Frontend development)

# Frontend Developer
(Describe Frontend designs and coding techniques.)

## Create and implement and effective frontend between humans and technology
(Comments. Be sure to illustrate developers comments in code and how this will facilitate current and future understanding of the key portions of system.)

### 1. Show frontend design artifacts (wire frames)

```
wire frames
```
<img width="960" alt="Screen Shot 2022-09-26 at 9 16 24 AM" src="https://user-images.githubusercontent.com/34950822/192328249-8453fa07-16a1-4e89-a896-0acfd934a354.png">

<img width="956" alt="Screen Shot 2022-09-27 at 9 35 43 AM" src="https://user-images.githubusercontent.com/34950822/192584566-5adea451-375e-4650-a03c-e0c9f394b256.png">

<img width="956" alt="Screen Shot 2022-09-27 at 9 35 43 AM" src="https://user-images.githubusercontent.com/50186752/192584990-f55d4173-1ba3-4737-8f74-95fdd1c05ff3.png">

### 2. Describe any consideration you have made for customer needs.

```
Based on our website, the goals of all customer who come to our website are all very simple, 
either want to see the data of sport player or want to see the data of the sport team. 
So we try to make our page as simple as possible, no ads, no extra image, but only the data and the link to the page.
For customer who uses our website daily, we decide to make a login system 
so that the users can create their own account and save their information
And for the login system, the users who have their own account wIll have an about page, 
in the page there is a notebook that they can write and save something they want, 
and in the page they can change the background to a video background by privide a link of video 
so that each one will have a different page from other.
```

### 3. Indicate accommodations you have made for English Language Learners or those with Disabilities

```
For English Language Learners, we decide to insert a translator so that they can use it to view our website.
Now we have two ideas of how to do it based on our ability of technology. one is to insert a button, 
if the user click the button it will translate the whole page and show in the screen currently, 
one is to use javascript that if users move their mouse above a word(english) they don't know, 
then it will Automatically create a small window that shows the definition of the word.
```

### 4. Show any screens that are currently developed
<img width="960" alt="Screen Shot 2022-09-26 at 9 16 24 AM" src="https://github.com/aaditgupta21/fantasy-football/blob/design/images/screen1.png?raw=true">

## Describe Code and Styles Frontend development

### 1. HTML, Markdown, JavaScript
```
1. I create several new pages and link to the four button， and create different java file for each pages and stone into the controllers directory.
```
```html
<!DOCTYPE HTML>
<!-- Signals to the Layout Dialect which layout should be used to decorate this View -->
<html xmlns:layout="http://www.w3.org/1999/xhtml" xmlns:th="http://www.w3.org/1999/xhtml"
      layout:decorate="~{layouts/base}" lang="en">

<head>
    <title>Players</title>
</head>

<body>
<th:block layout:fragment="body" th:remove="tag">
    


</th:block>
</body>

</html>
```
```java
package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class players {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/players")
    public String players() {

        // load HTML VIEW (birds.html)
        return "players";

    }
}
```
```
2. Then I emptied the nav page, and create a new nav for our project
```
```html
<!DOCTYPE html>
<html lang="en-US">
<!-- Begin navigation fragments -->
<th:block xmlns:th="http://www.w3.org/1999/xhtml" xmlns:sec="http://www.thymeleaf.org/extras/spring-security" th:fragment="header">
    <table style="width:80%; margin-top: 5%; margin-left: 2%;">
            <tr>
                <th><a class="nav-link" th:href="@{/}"><button class="button" style="vertical-align:middle"><span>Home</span></button></a></th>
                <th><a class="nav-link" th:href="@{/players}"><button class="button" style="vertical-align:middle"><span>Players</span></button></a></th>
                <th><a class="nav-link" th:href="@{/}"><button class="button" style="vertical-align:middle"><span>Standings</span></button></a></th>
                <th><a class="nav-link" th:href="@{/}"><button class="button" style="vertical-align:middle"><span>League</span></button></a></th>
                <th><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p></th>
                <th><div id="digital-clock"></div></th>
                <th><input style=" border-radius: 30px;" id="search" type="search" placeholder="Search" aria-label="Search"></th>
            </tr>

    </table>

            <!-- Navigation bar JavaScript support -->
            <script>
                const search = document.getElementById('search');
                const google = 'https://www.google.com/search?q=site%3A+';
                const site = 'https://nighthawkcodingsociety.com';

                function submitted(event) {
                    if (event.key === 'Enter') {
                        // calculations to determine new window size at 66% of existing
                        const reduction = 0.66;  // reduce by 66%
                        const w = Math.trunc(window.innerWidth*reduction);
                        const h = Math.trunc(window.outerHeight*reduction);
                        const l = Math.trunc(window.top.screenX + ((window.innerWidth - w)/2));
                        const t = Math.trunc(window.top.screenY + ((window.outerHeight - h)/2));
                        const left = "left=" + l;
                        const top = "top=" + t;
                        const width = "width=" + w;
                        const height = "height=" + h;
                        const location = left + ", " + top + ", " + width + ", " + height

                        // setup and display window
                        event.preventDefault();
                        const url = google
                            + site
                            + '+'
                            + search.value;
                        const win = window.open(url, "CompSci A Search", location);
                        win.focus();
                    }
                }
                search.addEventListener('keypress', submitted);

            </script>
                
</th:block>
</html>
```

```
Also I create a css file and js file so that I can show local timing in the nav and also make video background, etc.
```
```css
#video_wrapper {
    margin:0px;
    padding:0px;
}
#video_wrapper video {
    position: fixed;
    top: 50%; left: 50%;
    z-index: -99;
    min-width: 100%;
    min-height: 100%;
    width: auto;
    height: auto;
    transform: translate(-50%, -50%);
} 


table { background: rgba(0,0,0,0.2); }
tr { background: rgba(0,0,0,0.2); }
td { background: rgba(0,0,0,0.2); }

.button {
    display: inline-block;
    border-radius: 30px; padding: 5px 35px;
    text-align: center;
    transition: all 0.5s;
    cursor: pointer;
    margin: 5px;
}



.button span {
cursor: pointer;
display: inline-block;
position: relative;
transition: 0.5s;
}

.button span:after {
content: '\00bb';
position: absolute;
opacity: 0;
top: 0;
right: -20px;
transition: 0.5s;
}

.button:hover span {
padding-right: 25px;
}

.button:hover span:after {
opacity: 1;
right: 0;
}
```
```js
var l;
function getDateTime(){
        var now     = new Date(); 
        var year    = now.getFullYear();
        var month   = now.getMonth()+1; 
        var day     = now.getDate();
        var hour    = now.getHours();
        var minute  = now.getMinutes();
        var second  = now.getSeconds(); 
        l = hour;
        if(month.toString().length == 1) {
             month = '0'+month;
        }
        if(day.toString().length == 1) {
             day = '0'+day;
        }   
        if(hour.toString().length == 1) {
             hour = '0'+hour;
        }
        if(minute.toString().length == 1) {
             minute = '0'+minute;
        }
        if(second.toString().length == 1) {
             second = '0'+second;
        }   
        var dateTime = year+'/'+month+'/'+day+' '+hour+':'+minute+':'+second;   
         return dateTime;
    }
    
    setInterval(function(){
        currentTime = getDateTime();
        document.getElementById("digital-clock").innerHTML = currentTime;
    }, 1000);
    
function checking(){
    var video = document.getElementById("background");
    if ((l>=0)&&(l<=5)){
        video.setAttribute("src","https://drive.google.com/uc?export=view&id=17ygkkkTDZb219cgsmglfod33qP8PGW58");
    }
    else if((l>=6)&&(l<=9)){
        video.setAttribute("src","https://drive.google.com/uc?export=view&id=1GV5A1SChf-hhkKheakg01GBd-CjpzlHx");
    }
    else if((l>=9)&&(l<=12)){
        video.setAttribute("src","https://drive.google.com/uc?export=view&id=1BFKYi3db4VSzsVtV6-imY8mhcOxHe-g_");
    }
    else if((l>=13)&&(l<=17)){
        video.setAttribute("src","https://drive.google.com/uc?export=view&id=1w4kUtoqYsylUpLU_g3oI7OtYhhPcQIiM");
    }
    else if((l>=18)&&(l<=20)){
        video.setAttribute("src","https://drive.google.com/uc?export=view&id=10qZhLCMqm_RDj89Jjp8edLKLurSjQmh-");
    }
    else if((l>=21)&&(l<=23)){
        video.setAttribute("src","https://drive.google.com/uc?export=view&id=1IOK35bZ6iM5q4rYxhLmlFwYa3lHjINXR");
    }        
}       
```

```
3. Then I create the home page
```

```html
<!-- This page is illustrative and contains ideas about HTML formatting -->
<!DOCTYPE HTML>
<!-- Signals to the Layout Dialect which layout should be used to decorate this View -->
<html xmlns:layout="http://www.w3.org/1999/xhtml" xmlns:th="http://www.w3.org/1999/xhtml"
      layout:decorate="~{layouts/base}" lang="en">

<head>
    <title>Home</title>
</head>

<body>
<th:block layout:fragment="body" th:remove="tag">
    
<div id="video_wrapper">
    <video autoplay loop>
        <source src="https://drive.google.com/uc?export=view&id=1NAyWoJIA8d3SunU8iH2m_9tz2qsHNL3Y" type="video/mp4">
    </video>
    <img style="width: 800px; height: auto; margin-top: 3%; margin-left: 3%; border-radius: 5px;
    box-shadow: 7px 7px 7px #666666;" th:src="@{/images/football.png}" alt="football">
</div>


</th:block>
</body>

</html>
```
### 2. Cards, Tables, Blogging
```
I don't get it, what is Cards, Tables, Blogging. If the Blogging means to create a github page that stone our team's work then the page you looking at is our blog.
```

# DevOps Engineer
(Describe the technical systems and processes used to ensure the ability to do continuous updates and integration of software.)

## Describe software and programming tools

### 1. Identify authoring tools (IDE’s, Docker, GitHub) used

```

```

### 2. Describe and/or show visuals of interactions and integration of programming languages, protocols, and data within project. For instance, deployed systems of Docker Images, Nginx, DNS hosting the application.

```

```

### 3. Describe and/or illustrate key Web Applications, APIs, and dependency systems that will be required to complete this system (Diagram).
```

```


## Describe GitHub branch management and sociology used to ensure ability to perform continuous builds and integrations.

### 1. GitHub projects

```

```

### 2. Branching Strategies

```

```

### 3. Deployment processes and automation
```

```

## Describe how to validate and test the complete system
```

```

## mr. M suggestion is this person helps with Backend development

# Backend Developer
(Describe backend coding and requirements.)

## Develop data, data types, databases, and APIs.
(Comments. Be sure developers use comments in code to facilitate current and future understanding of the key portions of system.)

### 1. Identify authoring tools (IDE’s, Postman) used.

```

```

### 2. Describe and/or illustrate key data types, data structures (Lists, Dictionaries), objects, files, or databases that will be used (Flow Chart/UML).

```

```

### 3. Describe use of Lists or Dictionaries, database, tables, attributes, records, and systems of access (JSON, Lists, Dictionaries).

```

```


# Hacks (Video 1). Recommend… Minimize talking, minimize mouse movements, and share Tangibles.
(Make a less than 4 minute video. Each individual should talk in video, code, and make their part of the video. Consider crossing over to other tables and share methods and methodologies of those working on similar roles.)

### Scrum Master should make sure all things come together
### DevOps should ensure there is a working project to Demo at all times.
### Everyone should complete their part(s).
### veryone should help other Team Members when struggling.
(Video link can post below here)


