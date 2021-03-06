package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Administrator on 2018/5/24.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterRepository spitterRepository;

//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String showRegistrationForm() {
//        return "registerForm";
//    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    //参数校验
    public String processRegistration(@RequestPart MultipartFile profilePicture, @Valid Spitter spitter, Errors errors, RedirectAttributes model) throws UnsupportedEncodingException {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        try {
            profilePicture.transferTo(new File("" + profilePicture.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        spitterRepository.save(spitter);
//        return "redirect:/spitter/" + URLEncoder.encode(spitter.getUsername(), "utf-8");
        model.addAttribute("username", spitter.getUsername());
        model.addFlashAttribute(spitter);
        return "redirect:/spitter/{username}";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable("username") String username, Model model) {
        if (!model.containsAttribute("spitter")) {
            Spitter spitter = spitterRepository.findByUsername(username);
            model.addAttribute(spitter);
        }
        return "profile";
    }
}
