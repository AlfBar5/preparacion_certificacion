package pruebas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {

	public static void main(String[] args) {


		LocalDate ldt1=LocalDate.of(2023, 11, 29);
		LocalDate ldt2=LocalDate.of(2023, 11, 30);
		LocalTime lt1=LocalTime.of(13,30);
		LocalTime lt2=LocalTime.of(21,15);
		
		//Duration no tiene en cuenta la fecha, solo la hora
		System.out.println(Duration.between(lt1, lt2)); //7h 45  
		
		//Periodo temporal PT
		//Hora H
		//Minutos M
		 
		//Da PT7H45M 
		
		
		System.out.println("---------------------");
		

		ZonedDateTime zldt1= ZonedDateTime.of(ldt1, lt1, ZoneId.of("GMT+2"));
		System.out.println(zldt1);
				
		ZonedDateTime zldt2= ZonedDateTime.of(ldt2, lt2, ZoneId.of("GMT-3"));
		System.out.println(zldt2);
		
		
		//Teniendo en cuenta la zona horaria + 2 -3 (Al reves
		System.out.println(Duration.between(zldt2, zldt1)); //PT36H45M
		
		//Teniendo en cuenta la zona horaria + 2 -3 (Al reves
		System.out.println(Duration.between(zldt1, zldt2)); //PT36H45M
		
		
		
		// Teniendo en cuenta que en Nueva York, el cambio de hora de primavera se produjo el 13 de marzo a las 2:00 horas, 
		//¿qué mostrará el siguiente código?:
		LocalDateTime ld1=LocalDateTime.of(2022, 3, 13,1,30,30); 
		ZonedDateTime zd1=ZonedDateTime.of(ld1, ZoneId.of("America/New_York"));
		ZonedDateTime zd2=zd1.plusHours(1); // 3:30, hemos sumado una hora en el cambio de hora
		ZonedDateTime zd3=zd1.minusHours(1); //12:30
		System.out.println(Duration.between(zd3,zd2)); //3:30-12:30
		
		
		//da PT2H. LLEVARLO TODO A LA MISMA ZONA HORARIA
		var ldt111=LocalDateTime.of(2020,11,20,22,30,15); //22:30
		var ldt222=ldt111.minusHours(3); //19:30:15
		var zdt111=ZonedDateTime.of(ldt111,ZoneId.of("GMT")); //22:30
		var zdt222=ZonedDateTime.of(ldt222,ZoneId.of("GMT-5")); //0:30:15 // Se le suman 5 horas -(-5)
		System.out.println(Duration.between(zdt111, zdt222)); //22:30 – 0:30
		
	}

}
