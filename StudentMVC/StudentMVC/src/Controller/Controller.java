package Controller;

import Model.ModelList;
import View.View;

public class Controller {
    private ModelList model;
    private View view;
    
    public Controller(ModelList model, View view) {
        this.model = model;
        this.view = view;
    }

    public void update()
    {
        view.printAllStudents(model.getAllStudents());
    }


}
