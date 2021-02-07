package de.bitrecycling.timeshizz;

import de.bitrecycling.timeshizz.management.service.ClientService;
import de.bitrecycling.timeshizz.management.service.ProjectService;
import de.bitrecycling.timeshizz.timetracking.service.ActivityEntryService;
import de.bitrecycling.timeshizz.timetracking.service.ActivityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TimeshizzApplication.class)
public class ServiceTests {

    @Autowired
    ClientService clientService;
    @Autowired
    ProjectService projectService;
    @Autowired
    ActivityService activityService;
    @Autowired
    ActivityEntryService activityEntryService;


    /**
     * tests if exception is thrown if resource not found. The exception is mapped to 404 response
     */
    @Test
    public void testError(){
        //todo replace with restassured
//        StepVerifier.create(clientService.byId("n/a")).verifyError(ResourceNotFoundException.class);
//        StepVerifier.create(clientService.delete("n/a")).verifyError(ResourceNotFoundException.class);
//        ClientEntity client = new ClientEntity();
//        client.setId("n/a");
//        StepVerifier.create(clientService.update(client)).verifyError(ResourceNotFoundException.class);
//        StepVerifier.create(projectService.byId("n/a")).verifyError(ResourceNotFoundException.class);
//        StepVerifier.create(projectService.delete("n/a")).verifyError(ResourceNotFoundException.class);
//        StepVerifier.create(projectService.update("n/a", null, null)).verifyError(ResourceNotFoundException.class);
//        StepVerifier.create(taskService.byId("n/a")).verifyError(ResourceNotFoundException.class);
//        StepVerifier.create(taskEntryService.byId("n/a")).verifyError(ResourceNotFoundException.class);
    }

}
