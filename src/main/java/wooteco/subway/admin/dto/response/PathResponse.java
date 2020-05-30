package wooteco.subway.admin.dto.response;

import java.util.List;

public class PathResponse {
    private List<StationResponse> stations;
    private int duration;
    private int distance;

    public PathResponse() {
    }

    public PathResponse(List<StationResponse> stations, int duration, int distance) {
        this.stations = stations;
        this.duration = duration;
        this.distance = distance;
    }

    public static PathResponse of(List<StationResponse> stations, int duration, int distance) {
        return new PathResponse(stations, duration, distance);
    }

    public List<StationResponse> getStations() {
        return stations;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }
}
