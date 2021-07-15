
class Book
{
	String title="";
	String author="";
	String publish="";
	
	@Override
	public String toString() {
	
		return title + " " + author + publish;
	}

	public Book(String title, String author, String publish) {
		super();
		this.title = title;
		this.author = author;
		this.publish = publish;
	}
}


public class upgradeForLoop{
	public static void main(String[] args) {
		String words[] = new String[] {"C", "C++", "LISP",
				"PL/1","ALGOL", "PYTHON", "JAVA", "NODEJS"};
		
		for(int i=0; i<words.length; i++)
		{
			System.out.println(words[i]);
		}
		
		//���ο� ���� �� �迭�� ��� Ÿ���� �ɾ ������ �ϳ� �����
		// : �� �ڿ� �迭
		//�迭�κ��� �����͸� �ϳ��� �ڵ����� �о�ͼ� �տ� ������ �־��ش�.
		for(String w : words)
		{
			System.out.println(w);
		}
		
		Book []books = new Book[] {
				new Book("�����ѵ���", "��û��", "���а�����"),
				new Book("�߰�����", "�������丮", "���л�"),
				new Book("���Ʒ����Ķ�", "��ö��", "�س�"),
				new Book("�������� ��", "���طѸ�", "������"),
				new Book("���", "������", "�ð���")
		};
		
		for(Book book : books)
		{
			System.out.println(book); //toString override
		}
		
		Book []books2 = books; //���� ����
		books[0] = new Book("�޹������̱�", "���۸�", "�޻�");
		

		for(Book book : books)
		{
			System.out.println(book); //toString override
		}
		

		for(Book book : books2)
		{
			System.out.println(book); //toString override
		}
		
		//��������
		Book []deepCopy = books.clone();
		books[0] = new Book("�ְ�����", "���ؼ�", "����");
		
		for(Book book : books)
		{
			System.out.println(book); //toString override
		}

		for(Book book : deepCopy)
		{
			System.out.println(book); //toString override
		}
	}
}
