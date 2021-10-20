package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Class AppService
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 20/10/2021
 */
public class AppService {
    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    public static void executer(String param) {
        LOG.debug("Traitement 1 : param = {}", param);
    }
}