package nLayedDemo.dataAccess.Abstracts;


import java.util.List;

import nLayedDemo.entities.concretes.Product;

public interface ProductDao {
void add(Product product);
void update(Product product);
void delete(Product product);
Product get(int id);
//bana bir tane id ver bu id i�eriden bir product bulsun.
List<Product> getAll();
//arrayler sabit yap�lard�r. arraylere eleman eklersek s�k�nt� ya�ar�z.

}
