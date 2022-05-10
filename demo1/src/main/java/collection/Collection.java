package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	
	
	private List<String> name ;
	private Set<String> city ;
	private Map<String,Integer> film ;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, Integer> getFilm() {
		return film;
	}
	public void setFilm(Map<String, Integer> film) {
		this.film = film;
	}
	@Override
	public String toString() {
		return "Collection [name=" + name + '\n'+" , city=" + city + '\n'+ ", film=" + film + "]";
	}
	
	
	
	
	}
