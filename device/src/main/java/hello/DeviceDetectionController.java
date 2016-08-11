package hello;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 10/08/16.
 */
@Controller
public class DeviceDetectionController {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:YYYY");

    @RequestMapping("/detect-device")
    public @ResponseBody
    String detectDevice(Device device) {
        String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "PC";
        } else if (device.isMobile()) {
            deviceType = "teléfono";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }
        String message = "Hoy es <b>"+dateFormat.format(new Date())+"</b> estás conectado desde "+deviceType;
        return message;
    }

}
