# experoment2
experoment2
# 阅读程序

## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
掌握面向对象的类设计方法（属性、方法）；  
掌握类的继承用法，通过构造方法实例化对象；  
学会使用super()，用于实例化子类；  
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  


## 实验过程
业务要求：  
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
对象示例：  
人员（编号、姓名、性别……）  
教师（编号、姓名、性别、所授课程、……）  
			学生（编号、姓名、性别、所选课程、……）  
			课程（编号、课程名称、上课地点、时间、授课教师、……）  
实验要求：  
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  

首先创建一个teacher类，分别定义int id，String teacherName，Course[] courses，三个变量，来利用getId()，setId(int id)，String getTeacherName()，setTeacherName等方法进行这三个变量的赋值和修改，用来表示教师的序号，
姓名，以及授课。
  
其次构造Course类，定义int courseId,String courseName,float credit,Teacher teacher这四个变量，分别代表课程成的序号，课程的名字
，课程的学分，以及授课教师。并再次用void setId(int id)，int getId()，void setName(String name)，String getName()，void setCredit(float credit )，float getCredit()，Teacher getTeacher
，void setTeacher(Teacher teacher)等方法，对着四个变量的值进行增添或者修改。利用boolean addStudent(Student stu)方法来表示学生是否加入课成功，用if语句if(!isSelectedStudent(stu)&&isNullStudent(stu))来
定义方法执行的条件如果学生没有选过这门课，同时课的学生还没满则执行，用方法boolean removeStudent(Student stu)来移除选课学生，同样用if(isSelectedStudent(stu))来判断学生是否选了此课作为方法执行的
条件。用void displayStudent()方法来显示选择课程的学生。子方法1：boolean isSelectedStudent(Student stu)判断学生是否选过这门课程。子方法2：boolean isNullStudent(Student stu)判断课程是否还有空位
.  
  
创建一个student类，String stuName;int stuId;String major;Course[] courses;定义四个变量，分别代表学生的姓名，学号，专业，和课程。并定义方法来对这四个变量的书籍修改和删除，
然后定义与Course类中类似的方法来实现学生选课，退课等操作，并利用类似的子方法来显示学生是否选课与学生是否还有选课位置。



## 重要方法
方法一：public Course(int courseId,String courseName,float credit,Teacher teacher) {  
        super();  
        this.courseId=courseId;  
        this.courseName=courseName;  
        this.credit=credit;  
        this.setTeacher(teacher);  
        students = new Student[30];  
    }  
    public Course(int courseId,String courseName,float credit) {  
        super();  
        this.courseId=courseId;  
        this.courseName=courseName;  
        this.credit=credit;  
        students = new Student[30];  
    }  
方法二： public boolean addStudent(Student stu){  
        boolean flag = false;  
        if(!isSelectedStudent(stu)&&isNullStudent(stu)){  
            for(int i=0;i<students.length;i++){  
                if(students[i]==null){  
                    students[i]=stu;  
                    flag=true;  
                    break;  
                }  
            }  
        }  
        return flag;  
    }  
方法三： public boolean removeStudent(Student stu){  
        boolean flag=false;  
        if(isSelectedStudent(stu)){  
            for(int i=0;i<students.length;i++){  
                if(students[i]==stu){  
                    students[i]=null;  
                    flag=true;  
                    break;  
                }  
            }  
        }  
        return flag;  
    }  
方法四： public void displayStudent(){  
        System.out.println("选择的课程："+this.courseName+"的学生有:");  
        for(Student s:students){  
            if(s!=null){  
                System.out.print(s.getStuName()+" ");  
            }  
        }  
        System.out.println();  
    }  

## 实验结果







## 实验感受
通过这次实验，我理解到了父类与子类之间的关系，更好的了解到了其中继承的关系，子类也可以重写父类的方法。一、父类引用指向子类对象时  

1、若子类覆盖了某方法，则父类引用调用子类重新定义的新方法
2、若子类未覆盖某方法，则父类引用调用父类本身的旧方法
3、若子类覆盖了某属性，但父类引用仍调用父类本身的旧属性
4、若子类未覆盖某属性，则父类引用调用父类本身的旧属性
5、父类引用不能访问子类新定义的方法

二、子类引用指向自身对象时  


1、若子类覆盖了某方法，则子类引用调用子类重新定义的新方法
2、若子类未覆盖某方法，则子类引用调用父类本身的旧方法
3、若子类覆盖了某属性，则子类引用调用子类重新定义的新属性
4、若子类未覆盖某属性，则子类引用调用父类本身的旧属性
5、子类引用可以访问子类新定义的方法 




