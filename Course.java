package ѧ��ѡ��;

public class Course {
    private String courseName;
    private int courseId;
    private Teacher teacher;
    private float credit;
    private Student[] students;
    //���캯��
    public Course(int courseId,String courseName,float credit,Teacher teacher) {
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

    public Course(int courseId,String courseName) {
        super();
        this.courseId=courseId;
        this.courseName=courseName;
        students = new Student[30];
    }

    public Course() {//Ĭ����ʽ��Ҫ���Է���һ
        super();
        students = new Student[30];
    }

    //�޸Ļ��ȡ����ֵid��name��credit��
    public void setId(int id){
        this.courseId=id;
    }
    public int getId(){
        return this.courseId;
    }
    public void setName(String name){
        this.courseName=name;
    }
    public String getName(){
        return this.courseName;
    }
    public void setCredit(float credit ){
        this.credit=credit;
    }
    public float getCredit(){
        return this.credit;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //�μ���ѧ��
    public boolean addStudent(Student stu){
        boolean flag = false;//��־ֵ���Ƿ����ɹ�
        //���ѧ��û��ѡ�����ſΣ�ͬʱ�ε�ѧ����û����ִ��
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
    //���Ƴ�ѧ��
    public boolean removeStudent(Student stu){
        boolean flag=false;
        if(isSelectedStudent(stu)){//ѡ�����ſ�
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
    //��ʾѡ��γ̵�ѧ����
    public void displayStudent(){
        System.out.println("ѡ��Ŀγ̣�"+this.courseName+"��ѧ����:");
        for(Student s:students){
            if(s!=null){
                System.out.print(s.getStuName()+" ");
            }
        }
        System.out.println();
    }
    //�ӷ���1��ѧ���Ƿ�ѡ�����ſ�
    public boolean isSelectedStudent(Student stu){
        boolean flag=false;
        for(Student s:students){//ֻ�����ڼ�飬�����޸�
            if(s==stu){
                flag=true;
                break;
            }
        }
        return flag;
    }
    //�ӷ���2��ѧ��ѧ��δ�ﵽ�޶�������
    public boolean isNullStudent(Student stu){
        boolean flag=false;
        for(Student s:students){
            if(s==null){//���п�λ
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
