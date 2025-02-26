import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll //Метод с этой аннотацией выполняется один раз перед всеми тестами в классе.
      static void beforeAll(){
        System.out.println("Here is beforeAll()");
    }

    @BeforeEach //Метод с этой аннотацией выполняется перед каждым тестом
     void BeforeEach(){
        System.out.println("    Here is BeforeEach()");
    }

    @AfterAll // Метод с этой аннотацией выполняется один раз после всех тестов в классе.
    static void AfterAll(){
        System.out.println("Here is AfterAll()");
    }

    @AfterEach // Метод с этой аннотацией выполняется после каждого теста.
    void AfterEach(){
        System.out.println("    Here is AfterEach()");
    }

    @Test // Метод с этой аннотацией является тестовым методом.
    void firstTest() {

        System.out.println("        Here is first test()");

    }
    @Test // Метод с этой аннотацией является тестовым методом.
    void secondTest() {

        System.out.println("        Here is second test()");

    }
}
