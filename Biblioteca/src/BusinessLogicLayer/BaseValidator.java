package BusinessLogicLayer;

public class BaseValidator<T> {
	
	 private StringBuilder _errors = new StringBuilder();
	 WhiteSpace ws = new WhiteSpace();

     protected void AddError(String error)
     {
         if (!ws.isWhitespace(error) || !(error == null))
         {
             _errors.append(error);
         }
     }

     public void ValidateEntity(T item)
     {
         if (_errors.length() != 0)
         {
             String temp = _errors.toString();
             _errors = null;
             try {
				throw new Exception(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
     }

     public void ValidateEntityUpdate(T item)
     {
         if (_errors.length() != 0)
         {
             String temp = _errors.toString();
             _errors = null;
             try {
				throw new Exception(temp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
     }
}
