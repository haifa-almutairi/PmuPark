# PmuPark
PmuPark is a mobile parking application built for Prince Mohammad Bin Fahd University (PMU). It helps students, faculty, staff, security, and visitors find, reserve, and manage parking spaces on campus reducing congestion and illegal parking.

## Overview
Finding parking on a busy campus can be a daily hassle. PmuPark solves this by letting
users:
- Check real-time parking availability
- Reserve a parking spot in advance for a specific date/time
- Get a QR code for fast, secure validation at entry
- Receive notifications for bookings, reminders, and cancellations
- Give admins full control over parking slots, reports, and analytics
The goal is a more organized, accessible, and stress-free parking experience for the entire
PMU community.

## Features
User Features
- Register / log in with PMU email authentication
- Password recovery via email
- Update profile information
- View real-time parking availability with filters (location, time)
- Reserve, modify, or cancel a parking spot
- Auto-release of reservation if not checked in within 15 minutes
- QR code generation for booking validation
- Push/email notifications for bookings, reminders, and expirations
- View past booking history
- Submit feedback about the parking experience
Security Features
- Scan user QR codes to verify bookings at entry
Admin Features
- Add, edit, or remove parking slots
- View user activity reports
- Generate usage analytics and reports
  
## Non-Functional Requirements
(Performance) Responds to user actions within 2 seconds

(Availability) 99.9% uptime during business hours

(Security) All communications encrypted via SSL/TLS

(Compatibility) Android 8+ and iOS 12+

(Scalability) Supports up to 1,000 concurrent users

(Storage) App footprint under 100 MB

(Localization) Arabic and English support

(Backup) Data backed up every 12 hours

(Launch Time) App launches within 3 seconds

(Compliance) Follows PMU and Saudi Arabia data privacy regulations

## Stakeholders
- PMU Students & Staff – primary users reserving/managing parking
- PMU Administration – oversight, reporting, and analytics
- Security Department – usage monitoring and compliance
- App Development Team – build and maintain the app
- IT Support – infrastructure and technical support
  
## Tech & Tools Used
Project management / Scrum board  (Trello)

UI/UX design  (Figma)

UML design (use case & class diagrams)  (StarUML)

Database design  (dbdiagram.io)

Backend prototyping  (Java)

## System Design
- Use Case Diagram – models interactions between Students, Staff, Administration, IT
Support, and the system
- Class Diagram – core entities: User , ParkingSlot , Reservation , QRScan , Feedback ,
UsageLog , Report , TechnicalSupport
- Database Schema – tables: Users , ParkingSlots , Bookings , QRScans , UsageLogs ,
Reports , Feedback , TechnicalSupport



## References
Figma — https://www.figma.com

StarUML — https://staruml.io/

dbdiagram.io — https://dbdiagram.io/

Trello 101 Guide — https://trello.com/guide/trello-101
