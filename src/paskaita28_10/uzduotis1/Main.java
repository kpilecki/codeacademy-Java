package paskaita28_10.uzduotis1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Set<String> names = gautiUnikaliusVardus( "C:\\Users\\chris\\Downloads\\vardai.txt");
		names.forEach(System.out::println);
		System.out.println( names.size() );
		
		Map<String, List<String>> galunes = gautiVarduGalunes( names );
		galunes.keySet().stream().sorted().forEach( v -> {
			System.out.println( "Su galune " + v + " " + galunes.get( v ).size() );
		});

	}
	
	public static Set<String> gautiUnikaliusVardus( String filePath ){
		Path path = Paths.get( filePath );
		try {
			Set<String> names = Files.lines( path )
					.flatMap( v -> List.of( v.split( " ") ).stream() )
					.map( v -> v.replaceAll( "[,|.|\\)|:|“|”|;]" , ""))
					.filter( v -> v.matches( "(?:[A-Z][a-z]*)"
							+ "(?:[^į|^ų|^u|^ą|^o|^t|^a|^ai|^ak])"
							+ "(?:al)")
							&& !isExluded( v )
							&& v.length() > 3 )
					.collect( Collectors.toCollection( TreeSet::new ) );
			//
			//"(?:as|is|us|ys|la)"

			return names;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	public static Map<String, List<String>> gautiVarduGalunes( Set<String> names ){
		return names
				.stream()
				.map( v -> v.substring( (v.length() - 2) ))
				.collect( Collectors.groupingBy( Function.identity()));
				
				
	}
	
	public static boolean isExluded( String word ) {
		HashSet<String> exludedWords = new HashSet<>();
		exludedWords.addAll( Set.of("Pagal"));
		
		return exludedWords.contains( word );
	}

}
