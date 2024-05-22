package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ProductsView;

public class LoggedInQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ProductsView.txtProducts.resolveFor(actor).getText();
    }

    public static  Question<String> value(){
        return new LoggedInQuestions();
    }
}
