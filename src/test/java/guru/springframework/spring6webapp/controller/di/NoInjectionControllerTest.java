package guru.springframework.spring6webapp.controller.di;

import org.junit.jupiter.api.Test;

class NoInjectionControllerTest {

    @Test
    void sayHello() {
        NoInjectionController controller = new NoInjectionController();

        System.out.println(controller.sayHello());
    }
}