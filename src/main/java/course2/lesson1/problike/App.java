package course2.lesson1.problike;

import course2.lesson1.problike.impl.CachedPublicationService;
import course2.lesson1.problike.impl.DbPublicationService;

public class App {
    public static void main(String[] args) {
        PublicationService publicationService = new CachedPublicationService(new DbPublicationService().getHotPublication());
        //PublicationService publicationService = new DbPublicationService();

        //много кода с исмпользованием publicationService
        for (int i = 0; i < 10; i++) {
            System.out.println(publicationService.getHotPublication());
        }
    }
}
