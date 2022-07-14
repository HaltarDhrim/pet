package it.haltardhrim.pet;

import java.sql.*;

public class App {
	public static void main(String[] args) {

		String query = "SELECT * FROM PETS";

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pets", "postgres", "postgres");
				PreparedStatement statement = conn.prepareStatement(query);) {
			ResultSet result = statement.executeQuery();

			while (result.next()) {

				System.out.println("Funziona!");
				Integer id = result.getInt("ID");
				String name = result.getString("NAME");
				Integer weight = result.getInt("WEIGHT");

				Pet pet = new Pet();
				pet.setId(id);
				pet.setName(name);
				pet.setWeight(weight);
				pet.toString();
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
