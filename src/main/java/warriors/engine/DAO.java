package warriors.engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DAO {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sqlhero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String usr = "test";
			String pwd = "test";

			Connection conn = DriverManager.getConnection(url, usr, pwd);

			// Création d'un objet Statement
			
			Statement statement = conn.createStatement();
			Scanner scanner = new Scanner(System.in);

			// L'objet ResultSet contient le résultat de la requête SQL

			getHeroes(statement);
			createHero(statement, scanner);
			deleteHero(statement, scanner);
			updateHero(statement, scanner);

			scanner.close();
			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Methods

	private static void display(ResultSet result, ResultSetMetaData resultMeta) throws SQLException {
		System.out.println("\n**********************************");

		for (int i = 1; i <= resultMeta.getColumnCount(); i++)
			System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
		System.out.println("\n**********************************");

		while (result.next()) {

			for (int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print("\t" + result.getObject(i).toString() + "\t |");
			System.out.println("\n---------------------------------");
		}
	}

	private static void getHeroes(Statement statement) throws SQLException {
		ResultSet result = statement.executeQuery("SELECT * FROM Hero");

		// Récupération des MetaData

		ResultSetMetaData resultMeta = result.getMetaData();
		display(result, resultMeta);
		result.close();
	}

	private static void getHero(Statement statement, Scanner sc) throws SQLException {
		System.out.println("\nEntrez Id personnage à afficher :");
		String input = sc.nextLine();
		String request = String.format("SELECT * FROM Hero WHERE Id = %s", input);
		ResultSet result = statement.executeQuery(request);
		ResultSetMetaData resultMeta = result.getMetaData();
		display(result, resultMeta);
		result.close();
	}

	private static void deleteHero(Statement statement, Scanner sc) throws SQLException {
		System.out.println("\nEntrez Id personnage à supprimer :");
		String input = sc.nextLine();
		String request = String.format("DELETE FROM Hero WHERE Id = %s", input);
		int result = statement.executeUpdate(request);
	}

	private static void createHero(Statement statement, Scanner sc) throws SQLException {
		String image = "";
		int lifepts = 0;
		int powerpts = 0;
		String weapon = "";
		String acc = "";
		String type = "";
		System.out.println("\nEntrez nom personnage");
		String name = sc.nextLine();
		System.out.println("\nType : 1 - Guerrier, 2 - Mage");
		int input = sc.nextInt();
		sc.nextLine();
		if (input == 1) {
			type = "Guerrier";
			image = "ImgWar";
			lifepts = 10;
			powerpts = 5;
			weapon = "Fourchette";
			acc = "Couvercle de poubelle";

		} else if (input == 2) {
			type = "Mage";
			image = "ImgWiz";
			lifepts = 5;
			powerpts = 10;
			weapon = "Baguette de pain";
			acc = "Pigeon";
		}
		String request = String.format(
				"INSERT INTO `Hero` (`IdHero`, `Type`, `Nom`, `Image`, `NiveauVie`,`NiveauForce`, `Arme/Sort`, `Bouclier`) VALUES (NULL, '%s', '%s', '%s', '%s', '%s', '%s', '%s')",
				type, name, image, lifepts, powerpts, weapon, acc);
		int result = statement.executeUpdate(request);

	}

	private static void updateHero(Statement statement, Scanner sc) throws SQLException {
		getHeroes(statement);
		System.out.println("\nEntrez Id personnage à modifier :");
		String idChar = sc.nextLine();
		System.out.println("\nQuelle valeur modifier ?");
		String column = sc.nextLine();
		System.out.println("\nEntrez nouvelle valeur :");
		String newValue = sc.nextLine();
		String request = String.format("UPDATE Hero SET %s = '%s' WHERE Id = %s", column, newValue, idChar);
		int result = statement.executeUpdate(request);
	}

}
