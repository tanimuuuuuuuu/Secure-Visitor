package b1v;

import java.util.Iterator;

privileged public aspect VisitorAspect {

		pointcut accept(Visitor visitor) :
			args(visitor) && call( void Element.accept(Visitor) );

		pointcut elementA(ElementA elementA) : target(elementA);
		pointcut elementB(ElementB elementB) : target(elementB);

		void around(Visitor visitor, ElementA elementA) : accept(visitor) && elementA(elementA) {
			visitor.visit(elementA);
		}

		void around(Visitor visitor, ElementB elementB) : accept(visitor) && elementB(elementB) {
			visitor.visit(elementB);
		}

		public void Element.accept(Visitor visitor) {}

		public void Visitor.visit(ElementA elementA) {
			System.out.println(currentdir + "/" + elementA);
			String savedir = currentdir;
			currentdir = currentdir + "/" + elementA.getName();
			Iterator it = elementA.iterator();
			while(it.hasNext()){
				Entry entry = (Entry)it.next();
				entry.accept(this);
			}
			currentdir = savedir;

		}


		public void Visitor.visit(ElementB elementB) {
			System.out.println(currentdir + "/" + elementB);
		}

	}