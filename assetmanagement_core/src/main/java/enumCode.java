
/*public class enumCode {
	 public enum OptivalInvoiceType {

			OPTIVAL_INTER_STATE("OIS"), // schema pos, toStore mandatory
			OPTIVAL_SUPPLIER_INVOICE("OSI"), // schema pos, supplierId mandatory
			FRANCHISE_RETURN_INVOICE("FRI"),// schema snd, toStore mandatory
			RITEMED_RETURN_INVOICE("RRI");// schema snd, toStore mandatory

			private String value;

			// Reverse-lookup map for getting a day from an abbreviation
			private static final Map<String, OptivalInvoiceType> lookup = new HashMap<>();

			static {
				for (OptivalInvoiceType invoiceType : OptivalInvoiceType.values()) {
					lookup.put(invoiceType.getValue(), invoiceType);
				}
			}

			OptivalInvoiceType(String v) {
				value = v;
			}

			public String getValue() {
				return value;
			}

			public static OptivalInvoiceType getName(String invoiceType) {
				return lookup.get(invoiceType);
			}
		}
}
*/