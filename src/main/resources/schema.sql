CREATE TABLE course (
  course_code VARCHAR(255) NOT NULL,
   course_title VARCHAR(255),
   semester VARCHAR(255),
   unit INT NOT NULL,
   CONSTRAINT pk_course PRIMARY KEY (course_code)
);

CREATE TABLE result (
  student_id INT NOT NULL,
   first_name VARCHAR(255),
   last_name VARCHAR(255),
   course_title VARCHAR(255),
   course_code VARCHAR(255),
   grade CHAR NOT NULL,
   score INT NOT NULL,
   CONSTRAINT pk_result PRIMARY KEY (student_id)
);

CREATE TABLE staff (
  staff_id BIGINT NOT NULL,
   name VARCHAR(255),
   department VARCHAR(255),
   salary INT NOT NULL,
   rank VARCHAR(255),
   CONSTRAINT pk_staff PRIMARY KEY (staff_id)
);

CREATE TABLE student (student_id INT NOT NULL, name VARCHAR(255), email VARCHAR(255), department VARCHAR(255), current_level INT NOT NULL, cgpa DOUBLE NOT NULL, CONSTRAINT pk_student PRIMARY KEY (student_id)
);