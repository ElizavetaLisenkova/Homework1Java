import models.*;
import services.*;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        TestService testService = new TestService();
        Test_listService testListService = new Test_listService();
        Student_answer studentAnswer = new Student_answer();
        RoleService roleService = new RoleService();
        GroupService groupService = new GroupService();
        QuestionService questionService = new QuestionService();
        AnswerService answerService = new AnswerService();

        Test_list test1 = new Test_list("Mathematics");
        Test_list test2 = new Test_list("English");
        Test_list test3 = new Test_list("Physical");

        testListService.saveTest_list(test1);
        testListService.saveTest_list(test2);
        testListService.saveTest_list(test3);

        Question question1 = new Question("Question 1", 3, true);
        Question question2 = new Question("Question 2", 4, true);
        Question question3 = new Question("Question 3", 2, true);

        questionService.saveQuestion(question1);
        questionService.saveQuestion(question2);
        questionService.saveQuestion(question3);


        Answer answer1 = new Answer("Answer 1", true);
        Answer answer2 = new Answer("Answer 2", false);
        Answer answer3 = new Answer("Answer 3", true);
        Answer answer4 = new Answer("Answer 4", true);
        Answer answer5 = new Answer("Answer 5", false);

        answerService.saveAnswer(answer1);
        answerService.saveAnswer(answer2);
        answerService.saveAnswer(answer3);
        answerService.saveAnswer(answer4);
        answerService.saveAnswer(answer5);

        Role student = new Role("Student");
        Role teacher = new Role("Teacher");

        User user1 = new User("Лисенкова", "Елизавета", "Андреевна", "eelisn", "123");
        user1.setRole(student);

        User teacher1 = new User("Божедаров", "Данила", "Алексеевич", "delbozh", "123");
        teacher1.setRole(teacher);

        userService.saveUser(user1);

        userService.saveUser(teacher1);

        System.out.println(userService.getTeachers());
        System.out.println(userService.getTeachers());
        System.out.println(questionService.findAll());

        System.out.println(roleService.findAll());
        System.out.println(answerService.findAll());
        System.out.println(questionService.findQuestion(1));

    }
}
