package projekt_zaliczeniowy;

public class Aktualizuj_Biblioteke implements Runnable
{

	@Override
	public void run() 
	{
		Obiekt_obserwator obserw=new Obiekt_obserwator();
		try 
		{
			Biblioteka.getInstance().dodajObserwatora(obserw);
		} catch (ClassNotFoundException e1) 

		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true)
		{
			
			try 
			{
				Thread.sleep(5000);
			} 
			catch(InterruptedException exc) 
			{
				System.out.println("W¹tek zliczania czasu zoosta³ przerwany.");
				return;
			}

			try 
			{
				Biblioteka.getInstance().powiadamiajObserwatorow();
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	} 
		
}


