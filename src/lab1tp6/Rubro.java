package lab1tp6;

/**
 *
 * @author Leonel
 */
public enum Rubro {
    COMESTIBLE,
    LIMPIEZA,
    PERFUMERIA;

    public static Rubro[] rubros = Rubro.values();

    public static String[] capitalized() {
        String[] strs = new String[rubros.length];
        for (int i = 0; i < rubros.length; i++) {
            strs[i] = rubros[i].capitalize();
        }
        return strs;
    }

    public String capitalize() {
        String str = this.toString();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
