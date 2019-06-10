package spring.angular.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.angular.music.entity.Song;
import spring.angular.music.repository.SongRepository;

@Controller
public class HomeController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("api/listsongs")
    public @ResponseBody Iterable<Song> getAllSongs() {
        Iterable<Song> songs = songRepository.findAll();
        return songs;
    }


}
