package org.launchcode.skillstracker.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }


@RequestMapping(value="form", method= RequestMethod.GET)
    @ResponseBody
    public String sendForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "<label>Name:" +
                "<input type='text' name='name'/>" +
                "</label>" +
                "<label>My Favorite language:" +
                "<select name='language'>" +
                "<option value='JavaScript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +
                "</label>" +
                "<label>My Second Favorite language:" +
                "<select name='language2'>" +
                "<option value='JavaScript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +
                "</label>" +
                "<label>My Third Favorite language:" +
                "<select name='language3'>" +
                "<option value='JavaScript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +
                "</label>" +
                "<input type='submit' value='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @RequestMapping(value="form", method = RequestMethod.POST)
    @ResponseBody
    public String hello(@RequestParam String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
