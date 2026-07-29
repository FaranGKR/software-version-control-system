CREATE DATABASE VERSION_CONTROL_SYSTEM;
USE VERSION_CONTROL_SYSTEM;

create table softwares (
	software_id int Primary key,
    software_name varchar(50) not null,
    software_type VARCHAR(50),
    developer VARCHAR(100),
    license_type VARCHAR(50),
    release_date DATE,
    status VARCHAR(20)
);

select * from softwares;

CREATE TABLE End_Users (
    user_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    department VARCHAR(50),
    country VARCHAR(50),
    software_id INT,
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id)
);

CREATE TABLE Software_Releases (
    release_id INT PRIMARY KEY,
    software_id INT,
    version VARCHAR(20) NOT NULL,
    release_date DATE,
    released_by VARCHAR(100),
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id)
);

CREATE TABLE Version_Upgrades (
    upgrade_id INT PRIMARY KEY,
    user_id INT,
    software_id INT,
    old_version VARCHAR(20),
    new_version VARCHAR(20),
    upgrade_date DATE,
    upgrade_status VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES End_Users(user_id),
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id)
);