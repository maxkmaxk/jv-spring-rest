package mate.academy.spring.dto;

import java.time.LocalDateTime;

public class MovieSessionResponseDto {
    private Long id;
    private MovieResponseDto movieDto;
    private CinemaHallResponseDto cinemaHallDto;
    private LocalDateTime showTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovieResponseDto getMovieDto() {
        return movieDto;
    }

    public void setMovieDto(MovieResponseDto movieDto) {
        this.movieDto = movieDto;
    }

    public CinemaHallResponseDto getCinemaHallDto() {
        return cinemaHallDto;
    }

    public void setCinemaHallDto(CinemaHallResponseDto cinemaHallDto) {
        this.cinemaHallDto = cinemaHallDto;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }
}