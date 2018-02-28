package com.jpmcosta.test.realmtestproject.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class App extends RealmObject {

    public static App create(Long id) {
        App app = new App();
        app.id = id;
        return app;
    }

    @PrimaryKey
    public Long id;

    public int version;
}