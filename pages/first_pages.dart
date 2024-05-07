import 'package:flutter/material.dart';
import 'package:navegacao/contato.dart';
import 'package:navegacao/pages/second_page.dart';

class firstPage extends StatelessWidget {
  const firstPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("first page"),
      ),
      body: Center(
        child: ElevatedButton(
          child: const Text(
            'Navegar 2',
          ),
          onPressed: () {
            /*Navigator.of(context).push(
                MaterialPageRoute(builder: (context) => const SecondPage()));*/
            Navigator.of(context).push(
              MaterialPageRoute(
                builder: (context) => SecondPage(
                  contato: Contato('jhamil', 'jeferson@gmail.com'),
                ),
              ),
            );
          },
        ),
      ),
    );
  }
}
