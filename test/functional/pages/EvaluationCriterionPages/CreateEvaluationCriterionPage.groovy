package pages.EvaluationCriterionPages

import geb.Page

class CreateEvaluationCriterionPage extends Page {

    static url = "/TA/evaluationCriterion/create"

    static at =  {
        title ==~ /Create Criterion/
    }

    def fillEvaluationCriterionDetails(String name) {
        $("form").name = name
    }

    def selectCreateEvaluationCriterion() {
        $("input", name: "create").click()
    }
}
