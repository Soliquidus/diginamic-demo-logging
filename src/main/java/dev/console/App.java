package dev.console;

import dev.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class App
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 20/10/2021
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOG.info("Démarrage du logging Slf4J !");

        AppService.executer("Test");

        LOG.info("Mise à jour des logs terminée !");
    }
}