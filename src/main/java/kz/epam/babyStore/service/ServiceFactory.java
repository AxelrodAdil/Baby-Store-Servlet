package kz.epam.babyStore.service;

import kz.epam.babyStore.service.impl.ErrorService;
import kz.epam.babyStore.service.impl.MainService;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {

    private static final Map<String, Service> SERVICE_MAP = new HashMap<>();

    public Service getService(String request) {
        Service service = SERVICE_MAP.get("/error");
        for (Map.Entry<String, Service> pair : SERVICE_MAP.entrySet()) {
            if (request.equalsIgnoreCase(pair.getKey())) {
                service = SERVICE_MAP.get(pair.getKey());
            }
        }
        return service;
    }

    static {
        SERVICE_MAP.put("/error", new ErrorService());
        SERVICE_MAP.put("/main", new MainService());
    }

    public static ServiceFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final ServiceFactory INSTANCE = new ServiceFactory();
    }
}
