# Mothers Group Web Application

## Project Overview
A web application for a Coast Guard spouses to facilitate communication and coordination
outside of social media. Provides a centralized platform for members to share news,
manage events, and access group resources.

## Tech Stack
- Java 17+
- Spring Boot
- Maven
- HTML/CSS/JavaScript (frontend)

## Project Structure
src/main/java/com/app/coastiespousecc/
├── model/          # Data model classes (POJOs)
└── controller/     # REST API controllers

src/main/resources/static/   # Frontend HTML/CSS/JS files

## Current State
### Completed Models & Controllers
- Member (member directory with isAdmin boolean flag)
- NewsPost (group announcements with LocalDateTime timestamp)

### In Progress
- Event model and controller
- Resource model and controller (links/references)

### Planned Features
- Gallery (photo sharing - most complex, do last)
- Authentication/authorization (admin vs member roles)
- AWS deployment

## Architecture Decisions
- In-memory storage (ArrayList) for now - database to be added later
- No authentication yet - planned for v2
- RESTful API with standard CRUD endpoints (GET, POST, PUT, DELETE)
- Admin functionality identified by isGroupLeader boolean on Member model

## API Conventions
- All endpoints follow REST conventions
- Use Long (wrapper class) for all ID fields
- Use String for phone numbers
- Use LocalDateTime for all date/time fields
- Loop with .get(i) not .getId(i) for ArrayList iteration
- Use .equals() for Long comparison, never ==

## Running the Project
- Run TodoApiApplication.java main method in IntelliJ
- API available at http://localhost:8080
- Test endpoints with curl in Git Bash

## Next Steps
1. Complete Event model and controller
2. Complete Resource model and controller
3. Build simple HTML frontend for all pages
4. Deploy to AWS (low cost)
5. Add authentication (v2)