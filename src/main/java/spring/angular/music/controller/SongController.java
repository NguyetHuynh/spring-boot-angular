package spring.angular.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.angular.music.entity.Song;
import spring.angular.music.repository.SongRepository;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping(path="/add")
    @ResponseBody
    public String addNewSong(
            @RequestParam String name,
            @RequestParam String author,
            @RequestParam String singer,
            @RequestParam String link){
        return "Saved";
    }
}
