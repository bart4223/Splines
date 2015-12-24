package Splines;

import Uniwork.Appl.NGApplication;

public class Main extends NGApplication {

    @Override
    public void DoBeforeInitialize() {
        super.DoBeforeInitialize();
        MainApplicationModule main = (MainApplicationModule)FModuleManager.addModule(MainApplicationModule.class, "Main");
        main.setPrimaryStage(FPrimaryStage);
    }

    @Override
    protected void registerObjectRequests() {
        super.registerObjectRequests();
        //registerObjectRequest("Application", this, "addSampleModule", "addSampleModule");
    }

    public Main() {
        super();
        FName = "Splines";
        FDescription = "Splines is a project to simulate splines";
        FConfigurationFilename = "resources/config.acf";
    }

    public static void main(String[] args) {
        launch(args);
    }

}
