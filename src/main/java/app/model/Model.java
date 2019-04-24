package app.model;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {

    private static Model instance = new Model();

    private List<User> model;

    private Model() {
        this.model = new ArrayList<>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> getUserNames(){
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
