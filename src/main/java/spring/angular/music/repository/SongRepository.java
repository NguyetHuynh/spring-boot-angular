package spring.angular.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.angular.music.entity.Song;

public interface SongRepository  extends JpaRepository<Song, Integer> {
}
