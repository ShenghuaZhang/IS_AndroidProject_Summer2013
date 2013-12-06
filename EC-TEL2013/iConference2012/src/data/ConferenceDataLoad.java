package data;

import java.util.ArrayList;

public class ConferenceDataLoad {

	
	public ConferenceDataLoad() {
	}

	public void loadConferenceInfo() {
		Conference.title = "ECTEL 2013";
		Conference.startDate = "Tuesday, September 17";
		Conference.description ="The European Conference on Technology Enhanced Learning (EC-TEL) is a unique opportunity for researchers, practitioners, and policy makers to address current challenges and advances in the field. Through EC-TEL, established and emerging researchers as well as practitioners, entrepreneurs, and technology developers explore new collaborations, strengthen networks, and compliment their core experience.";
		Conference.endDate = "Saturday, September 20";
		Conference.location = "Paphos, Cyprus";

	}
	public ArrayList<Keynote> loadKeynote(){
		ArrayList<Keynote> kList = new ArrayList<Keynote>();
		Keynote k;
		//Session 2  keynote
//		 k = new Keynote();
//	        k.ID = "1576";
//	        k.title = "Lessons from Project LISTEN: What have we learned from a reading tutor that listens?";
//	        k.description = "<p><img src=\"https://lh5.googleusercontent.com/SxByoa_YMEHrWiwyJjA_Ce7vrl-yFfR-uHmHXev8A-7rwTZ5wij17NcSL_0F3WO_GLzISEQ-hocg2AQOmqa5dC4z3dtDDnEmgky4aMzoNGC08gFRAAU1\" alt=\"Jack Mostow\" class=\"left\" > " 
//	        		        +"<p>For over 20 years, Project LISTEN has worked on getting computers to listen to children read aloud, and help them learn to read. Along the way we have learned lessons about children, reading, speech technology, intelligent tutors, educational data mining, and doing AIED research in schools.</p>"           
//	        		        +"<p>By the time I give this talk, I hope to have figured out what some of them are, memorable stories to illustrate them, and maybe even why you should care.</p>";
//	        k.date = "Wednesday, July 10";
//	        k.dayid = "5";
//	        k.beginTime = "09:00";
//	        k.endTime = "10:15";
//	        k.room = "FEC Theater";
//	        k.speakerName = "Jack Mostow";
//	        k.speakerAffiliation = "";
//	        kList.add(k);
		
		
		k = new Keynote();
		k.ID = "1679";
		k.title = "Making Sense of MOOCs: The Evolution of Online Learning in Higher Education";
		k.description = "<p><img src=\"http://www.col.org/SiteCollectionImages/STAFF_jdaniel2008.jpg\" alt=\"John Daniel\" class=\"left\" > " 
		        + "<img src=\"http://sirjohn.ca/wordpress/wp-content/uploads/2012/09/SUT632-150x150.jpg\" alt=\"Stamenka Uvalic-Trumbic\" class=\"left\" > " 
		        +"<p>Sir John Daniel is one of the world’s most eminent practitioners and thinkers in open, distance and technology mediated learning. He has helped to progress the international development agenda in education globally and has been a distinguished leader of universities and intergovernmental organisations in Canada, France and the United Kingdom. He obtained his full-time university education in Metallurgy at the Universities of Oxford and Paris and later demonstrated his commitment to lifelong learning by taking 25 years to complete a part-time Master’s degree in Educational Technology at Concordia University. The internship for this programme, which took him to infant UK Open University in 1972, was a life-changing experience. This quest took him on an international odyssey with appointments at the Télé-université, Québec (Directeur des Études, 1973-77); Athabasca University, Alberta (Vice-President for Learning Services, 1978-80); Concordia University, Montreal (Vice-Rector, Academic, 1980-84); Laurentian University, Ontario (President, 1984-90); the UK Open University (Vice-Chancellor, 1990-2001); UNESCO, Paris (Assistant Director-General for Education, 2001-04); and the Commonwealth of Learning, Vancouver (President and CEO, 2004-2012). His non-executive appointments have included the presidencies of the International Council for Open and Distance Education, the Canadian Association for Distance Education and the Canadian Society for the Study of Higher Education. He also served as Vice-President of the International Baccalaureate Organisation and is currently Education Master with the Beijing DeTao Masters Academy, China. From 2013 he chairs the International Board of the United World Colleges (UWC). Among Sir John’s 330 publications are his books Mega-Universities and Knowledge Media: Technology Strategies for Higher Education (Kogan Page, 1996) and Mega-Schools, Technology and Teachers: Achieving Education for All (Routledge, 2010).</p>";
		k.date = "Thursday, September 19";
		k.dayid = "3";
		k.beginTime = "09:00";
		k.endTime = "10:00";
		k.room = "Akamas-A";
		k.speakerName = "John Daniel, Stamenka Uvalic-Trumbic";
		k.speakerAffiliation = "";
		kList.add(k);
		
		k = new Keynote();
		k.ID = "1700";
		k.title = "Discussion Panel on \"Scaling Up Learning\"";
		k.description = "<p><img src=\"http://gti.upf.edu/wp-content/uploads/2011/03/daviniahl.jpg\" alt=\"Davinia Hernández-Leo\" class=\"left\" > " 
		        + "<img src=\"http://imke.tlu.ee/wp-content/uploads/2012/03/Tobias-150x150.jpg\" alt=\"Tobias Ley\" class=\"left\" > " 
		        +"<p>Panelists: Peter Brusilovsky, Vania Dimitrova, Thomas Herrmann, Mike Sharples, Marcus Specht</p>";
		k.date = "Friday, September 20";
		k.dayid = "4";
		k.beginTime = "16:00";
		k.endTime = "17:30";
		k.room = "Christian Barnard";
		k.speakerName = "Davinia Hernández-Leo, Tobias Ley";
		k.speakerAffiliation = "";
		kList.add(k);

		k = new Keynote();
		k.ID = "1710";
		k.title = "Beyond Horizon: learning and technology in EC policies and programming";
		k.description = "<p><img src=\"http://www.mifav.uniroma2.it/inevent/images/uploads/munari_r.jpg\" alt=\"Liina Munari\" class=\"left\" > " 
		        + "<p>Liina Munari is a senior research project officer at the European Commission, DG Connect, Unit G4 \"Youth, Skills and Inclusion\", based in Luxembourg. The unit is responsible for strategic planning, selection and monitoring of research and innovation projects in technology-enhanced learning and inclusion, funded by the 7th Framework Programme for Research (FP7) and the Competitiveness and Innovation Programme (CIP) of the European Commission. It also provides strategic policy guidance on learning and technology issues at the DG CONNECT, including Better Internet for Kids (BIK – formerly Safer Internet). Ms Munari is involved in all unit's research, innovation and policy work on technology-enhanced learning.Ms Munari has been working as an EU civil servant for her entire career since 1997. She has held various positions in different EU institutions, including the European Parliament and the EU Committee of the Regions. She joined the European Commission and the DG CONNECT (formerly DG INFSO) in 2006. Her first portfolio was on digital libraries, ICT for cultural heritage and digital preservation, and over the last years she has taken over the portfolio on learning. She holds a M.Soc.Sc in International Politics from the University of Helsinki, Finland, and a MA in European Political and Administrative Studies from the College of Europe, Bruges, Belgium.</p>";
		k.date = "Wednesday, September 18";
		k.dayid = "2";
		k.beginTime = "16:00";
		k.endTime = "17:00";
		k.room = "Akamas-A";
		k.speakerName = "Liina Munari";
		k.speakerAffiliation = "";
		kList.add(k);

		k = new Keynote();
		k.ID = "1695";
		k.title = "ICT-enabled innovation for learning in Europe and Asia - Exploring conditions for scalability and sustained impact at system level";
		k.description = "<p><img src=\"http://m.c.lnkd.licdn.com/mpr/mpr/shrink_200_200/p/4/000/12c/06c/09a64c1.jpg\" alt=\"Panagiotis Kampylis\" class=\"left\" > " 
		        + "<img src=\"http://www.media-and-learning.eu/sites/default/files/images/profile/yves-punie.jpg\" alt=\"Yves Punie\" class=\"left\" > " 
		        + "<p>Educational stakeholders recognise the role of ICT as a key enabler of innovation and creativity in E&T and for learning in general. Throughout Europe there are diverse national policies for ICT in education and many activities are undertaken to promote the use of ICT in education and training in Europe. Innovating in Education and Training (E&T) is also a key priority in several flagships of the Europe 2020 Strategy, in particular the Agenda for New Skills and Jobs, Youth on the Move, the Digital Agenda, and the Innovation Union Agenda.However, it is also highlighted that the full potential of ICT is not being realised in formal education settings and major questions are arising on the sustainability, impact, costs and mainstreaming of initiatives of ICT-enabled innovation for learning in Europe and beyond.The project \"Up-scaling Creative Classrooms in Europe\" (SCALE CCR), launched by the Information Society Unit at JRC-IPTS [1] in December 2011 on behalf of the Directorate-General Education and Culture (DG EAC),  aims to provide a better understanding of ICT-enabled innovation for learning that has significant scale and/or systemic impact, to further define the concept of Creative Classrooms (CCR) and to develop a set of policy recommendations for policy and decision makers for mainstreaming of ICT-enabled innovation in Education and Training across Europe.In the context of SCALE CCR project, three cases of ICT-enabled innovation for learning from Europe (eTwinning; 1:1 Learning in Europe; and Hellerup School, Denmark) and four cases from Asia (e-Learning Pilot Scheme, Hong Kong SAR; Knowledge Construction with Technology (CoREF), Japan; Third Masterplan for ICT in Education (mp3), Singapore; and Digital Textbook project, South Korea), were analysed covering aspects such as scale and nature of innovation, learning outcomes targeted, the role of technology in the innovation, and the implementation strategies. The lessons learnt about the necessary conditions for sustainability, scalability and impact at the system level are going to be discussed bringing evidence to the debate about the mainstreaming of ICT-enabled innovation for learning in Europe and beyond.[1] The Institute for Prospective Technological Studies (IPTS) is one of the seven scientific institutes of the European Commission's Joint Research Centre (JRC). IPTS consists of five research units, one of which is the Information Society Unit.</p>";
		k.date = "Friday, September 20";
		k.dayid = "4";
		k.beginTime = "09:00";
		k.endTime = "10:00";
		k.room = "Akamas-A";
		k.speakerName = "Panagiotis Kampylis, Yves Punie";
		k.speakerAffiliation = "";
		kList.add(k);



		
		return kList;
	}
	public ArrayList<Poster> loadPoster(){
		ArrayList<Poster> poList = new ArrayList<Poster>();
		Poster s;
		//poster 1
		
		s = new Poster();
		s.ID = "8437";
		s.name = "The Odder Experience on iPads in Schools: Reflecting on Digital Didactical Designs";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8443";
		s.name = "Interdisciplinary knowledge creation in Technology Enhanced Learning";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8444";
		s.name = "Transforming the campus into a digitally augmented learning space using etiquetAR";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8445";
		s.name = "Monitoring Learning in ABA Teaching of Children with Autism";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8452";
		s.name = "Enabling Educators to design Serious Games ? A Serious Game Logic and Structure Modeling Language (GLiSMo)";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8458";
		s.name = "JACK revisited: Scaling up in multiple dimensions";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8460";
		s.name = "IEEE-IST Academic: A web-based educational resources case-study";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8461";
		s.name = "Semantic Social Sensing for Improving Simulation Environments for Learning";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8466";
		s.name = "A generative computer language to customize online learning assessments";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8470";
		s.name = "A Context Modelling System and Learning Tool for Context-Aware Recommender Systems";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8475";
		s.name = "Augmenting the Web for Facilitating Foreign Language Vocabulary Learning";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8476";
		s.name = "Towards An Integrated Model of Teacher Inquiry into Student Learning, Learning Design, and Learning Analytics";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8481";
		s.name = "On dynamic and self-adapting recommendations of curricula for an individual technology enhanced learning experience";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8483";
		s.name = "Reflective learning in the workplace: The role of emotion";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8485";
		s.name = "Virtual Communities of Practice in Academia: Automated Analysis of Collaboration Based on the Social Knowledge-Building Model";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8487";
		s.name = "Designing Computation Systems for Serendipity in Learning";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8492";
		s.name = "A Component-Based Evaluation Framework for Social Personalized Adaptive E-Learning Systems";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8499";
		s.name = "Learning with e-Flashcards ? Does it matters?";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8500";
		s.name = "Evaluating relevance of educational resources of Social & Semantic Web";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8502";
		s.name = "Re-engineering the uptake of ICT in schools";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8512";
		s.name = "Design and Implementation of Conversational Agents for Harvesting Feedback in eLearning Systems";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8515";
		s.name = "Sharing the Burden: Introducing Student-Centered Orchestration in Across-Spaces Learning Situations";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8521";
		s.name = "Designing Scalable Informal Learning Solutions with Personas: A Pilot Study in the Healthcare Sector";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8527";
		s.name = "From Geocaching to Mobile Persuasive Learning - Motivating the interest in the life and work of Kaj Munk";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8529";
		s.name = "A methodological proposal to design of a trace-based system to qualify cognitive features inscribed in digital learning resources";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8531";
		s.name = "Learning instructional design in a project-based, technology-enhanced course";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8532";
		s.name = "How useful are semantic links for the detection of implicit references in CSCL chats?";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8535";
		s.name = "Detecting Discourse Creativity in Chat Conversations";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8541";
		s.name = "A Hybrid Multi-Recommender System for a Teaching and Learning Community for the Dual System of Vocational Education and Training";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8586";
		s.name = "The Open Design Library";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8587";
		s.name = "weSPOT: Working Environment with Social and Personal Open Tools for inquiry based learning";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8588";
		s.name = "NewsJob: Becoming Entrepreneurs! Developing New Skills for New Jobs";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8589";
		s.name = "Immersive Layers Design - Interface Design Using Kairos";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		s = new Poster();
		s.ID = "8590";
		s.name = "Persuasive Technology for Learning and Teaching - The EuroPLOT Project";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		poList.add(s);

		
		
		
		return poList;
	}
	public ArrayList<Workshop> loadWorkshopsDes() {
		//this.IdtoDate();
		
		ArrayList<Workshop> wList = new ArrayList<Workshop>();

		Workshop s;
        
        
		s = new Workshop();
		s.ID = "1";
		s.name = "ARTEL 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "N/A";
		s.content = "<p>Awareness and reflection are viewed differently across the disciplines informing Technology-Enhanced Learning (CSCW, psychology, educational sciences, computer science...). The ARTEL workshop brings together researchers and professionals from different backgrounds to provide a forum for discussing the multi-faceted area of awareness and reflection. This year workshop theme is:<br />How can awareness and reflection support learning in different settings (work, education, continuing professional development, lifelong learning, etc.). What are the roles that technology can play to support awareness and reflection in these contexts?<br />The workshop will include a paper session, a demo and prototype slam as well as an interactive session. The workshop aims at i) providing a forum for presenting and discussing research on awareness and reflection in TEL, ii) creating an interactive experience that connects participants¹ research, current tools or latest prototypes and models with real end users¹ learning experiences and requirements regarding reflection technology, and iii) creating an agenda for future ARTEL research and development.<br />This workshop is a direct follow-up of last year's ECTEL workshop <a href=http://teleurope.eu/artel12 target=_blank>ARTEL 2012</a>.<br />Find more information at the ARTEL13 workshop webpage: <a href=http://teleurope.eu/artel13 target=_blank>http://teleurope.eu/artel13</a></p>";
		s.childsessionID = "1682";
		wList.add(s);

		s = new Workshop();
		s.ID = "2";
		s.name = "ARTEL 2";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		s.content = "<p>Awareness and reflection are viewed differently across the disciplines informing Technology-Enhanced Learning (CSCW, psychology, educational sciences, computer science...). The ARTEL workshop brings together researchers and professionals from different backgrounds to provide a forum for discussing the multi-faceted area of awareness and reflection. This year workshop theme is:<br />How can awareness and reflection support learning in different settings (work, education, continuing professional development, lifelong learning, etc.). What are the roles that technology can play to support awareness and reflection in these contexts?<br />The workshop will include a paper session, a demo and prototype slam as well as an interactive session. The workshop aims at i) providing a forum for presenting and discussing research on awareness and reflection in TEL, ii) creating an interactive experience that connects participants¹ research, current tools or latest prototypes and models with real end users¹ learning experiences and requirements regarding reflection technology, and iii) creating an agenda for future ARTEL research and development.<br />This workshop is a direct follow-up of last year's ECTEL workshop <a href=http://teleurope.eu/artel12 target=_blank>ARTEL 2012</a>.<br />Find more information at the ARTEL13 workshop webpage: <a href=http://teleurope.eu/artel13 target=_blank>http://teleurope.eu/artel13</a></p>";
		s.childsessionID = "1685";
		wList.add(s);

		s = new Workshop();
		s.ID = "3";
		s.name = "Tutorial: ISG Assessment";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "12:30";
		s.room = "N/A";
		s.content = "<p>Seamless user performance assessment is a major topic for educational Serious Games in order to ensure that desired pedagogical goals are achieved, to provide proper feedback and support adaptivity without interrupting the player?s flow experience.  Devices and tools offering new interaction modalities that promise continuous user monitoring and assessment are available. However, the complex nature of individuality needs objective and systematic assessment of learner behavior and performance monitoring remains highly difficult.<br /><br />The tutorial will first explain different theoretical aspects (non-invasive assessment, framework for data-collection, learning analytics and how seamless assessment can be implemented).The second part will be practical oriented, and will demonstrate the practical use of stealth assessment: Looking firstly at two demonstrators, secondly playing a game and then analyzing the outcomes based on the learning analytic embedded in the game. Finally, the tutorial will present an approach for Services to support seamless assessment</p>";
		s.childsessionID = "1719";
		wList.add(s);

		s = new Workshop();
		s.ID = "4";
		s.name = "Creativity(CCL)";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "N/A";
		s.content = "<p>Learning can be viewed as a continuous iterative cycle through the processes of imagining, creating, playing, sharing and reflection. Learners develop and refine their abilities as creative thinkers. They learn to develop their own ideas, try them out, test the boundaries, experiment with alternatives, get input from others, and generate new ideas based on the feedback and their experiences. Fostering creativity in learning is increasingly seen as a key direction and focus for pedagogic approaches. Creative activity grows out of the relationship between the learner and the world of his or her educational context, as well as out of the ties between an individual and other learners. In this workshop we focus on the study, design, development and evaluation of emergent computational tools that aim to leverage creativity in learning processes.<br /><br /></p>";
		s.childsessionID = "1683";
		wList.add(s);

		s = new Workshop();
		s.ID = "5";
		s.name = "CulTEL 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "N/A";
		s.content = "<p>In today's global society, cultural awareness and tolerance of cultural diversity are paramount. This brings forth an opportunity for TEL, which can provide a broad range of examples with exposure to situations with cultural variations (e.g. in games, simulations, or online communities). However, embedding cultural aspects within TEL is a major challenge as interpretation on cultural issues can be very diverse, fluid and continuously evolving with changes in the society. There is a need to re-examine the underlying architectures and approaches currently adopted in TEL. Furthermore, new technologies (such as social media, mobile and ubiquitous computing) make it easier to share experiences and provide a rich source of cultural diversity. The time is ripe to bring together the different disciplines related to culturally-aware technology enhanced learning environments (e.g. computational modelling, virtual agents, cultural studies, communications, human computer interaction, and pedagogy) in order to shape the next generation culture-aware TEL.</p>";
		s.childsessionID = "1681";
		wList.add(s);

		s = new Workshop();
		s.ID = "6";
		s.name = "CulTEL 2";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		s.content = "<p>In today's global society, cultural awareness and tolerance of cultural diversity are paramount. This brings forth an opportunity for TEL, which can provide a broad range of examples with exposure to situations with cultural variations (e.g. in games, simulations, or online communities). However, embedding cultural aspects within TEL is a major challenge as interpretation on cultural issues can be very diverse, fluid and continuously evolving with changes in the society. There is a need to re-examine the underlying architectures and approaches currently adopted in TEL. Furthermore, new technologies (such as social media, mobile and ubiquitous computing) make it easier to share experiences and provide a rich source of cultural diversity. The time is ripe to bring together the different disciplines related to culturally-aware technology enhanced learning environments (e.g. computational modelling, virtual agents, cultural studies, communications, human computer interaction, and pedagogy) in order to shape the next generation culture-aware TEL.</p>";
		s.childsessionID = "1684";
		wList.add(s);

		s = new Workshop();
		s.ID = "7";
		s.name = "Informal Learning";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "N/A";
		s.content = "<p>The increasing presence of Web 2.0 media and tools in the workplace makes informal learning increasingly important and its recognition there becomes especially relevant since this can enhance employability, producing positive benefits for managers and companies, and give employees opportunities to learn and keep their skills up-to-date, etc. Thus, taking into account the technological and organizational innovation and the affordances of the Internet, it is necessary to define new methodologies and tools to make visible and manage this informal learning. This workshop will gather experiences about informal learning recognition, focusing on, but not limited to: validation of informal learning experiences, institutional management of informal knowledge, making use of representations of informal learning, decision making informed by informal learning experiences and using of learning analytics to document or promote informal learning.</p>";
		s.childsessionID = "1712";
		wList.add(s);

		s = new Workshop();
		s.ID = "8";
		s.name = "IWTA";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "N/A";
		s.content = "<p>The core problem that this workshop series on “Teaching Analytics” addresses is that in comparison with many other professionals that involve rapid decisions in a dynamically changing environment, presently teachers often do not get the data they need for decision-making in a timely fashion and in a meaningful and actionable format. Teaching Analytics as an emerging research area focuses on the design, development, evaluation, and education of visual analytics methods and tools for teachers in primary, secondary, and tertiary educational settings. Teachers’ professional practices with visual analytics methods and tools are a central concern of teaching analytics. Teaching analytics methods and tools aim to develop innovative solutions to assist and augment teachers’ dynamic decision-making in the classrooms of the 21st century. Furthermore, institutional learning can be supported by using aggregated data for decision-making in educational organizations. This can range from diagnostics, to data from standardized tests to socio-economic context data.</p>";
		s.childsessionID = "1713";
		wList.add(s);

		s = new Workshop();
		s.ID = "9";
		s.name = "MATEL 2";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "N/A";
		s.content = "<p>Motivational and affective aspects are at the crossroads of various disciplines involved in technology enhanced learning, and research is scattered among them. Their importance is increasingly recognized as a decisive factor for user acceptance and sustainable success of learning solutions, both at the workplace and in formal educational contexts. This workshop intends to continue to provide an interdisciplinary forum to bring together the various perspectives and to stimulate targeted research. It builds upon three successful editions at previous EC-TEL conferences and emphasizes the interactive exchange among participants. In addition to research contributions, demos, and position statements, we will have dedicated time slots for discussion and analysis of specific topics that are suggested and described by workshop participants beforehand.</p>";
		s.childsessionID = "1714";
		wList.add(s);

		s = new Workshop();
		s.ID = "10";
		s.name = "MATEL 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		s.content = "<p>Motivational and affective aspects are at the crossroads of various disciplines involved in technology enhanced learning, and research is scattered among them. Their importance is increasingly recognized as a decisive factor for user acceptance and sustainable success of learning solutions, both at the workplace and in formal educational contexts. This workshop intends to continue to provide an interdisciplinary forum to bring together the various perspectives and to stimulate targeted research. It builds upon three successful editions at previous EC-TEL conferences and emphasizes the interactive exchange among participants. In addition to research contributions, demos, and position statements, we will have dedicated time slots for discussion and analysis of specific topics that are suggested and described by workshop participants beforehand.</p>";
		s.childsessionID = "1723";
		wList.add(s);

		s = new Workshop();
		s.ID = "11";
		s.name = "TEFA 2";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "N/A";
		s.content = "<p>The goal of the workshop is to develop the notion of technology-enhanced formative assessment (TEFA) as a component for extending existing or new TEL approaches, further combining expertise from pedagogy, educational measurement, cognitive science, and information technology. A trend from dedicated to integrated and from sporadic to continuous formative assessment is envisioned. Challenging research questions will be addressed such as: How are established forms of formative assessment changing with the inclusion of technology and what new forms of formative assessment become possible? How is this reflected in new pedagogical approaches? How can today VLE support the provision of elaborated feedback?<br /><br />Position statement submissions are solicited (6 pages max. in Springer Format) that deal with approaches and innovative assessment technologies that support the transition from current assessment scenarios towards the development of e-assessment forms through which high level of meta-cognitive skills are evaluated, on-going feedback is provided, and students are more engaged in the learning process.</p>";
		s.childsessionID = "1720";
		wList.add(s);

		s = new Workshop();
		s.ID = "12";
		s.name = "TEFA 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		s.content = "<p>The goal of the workshop is to develop the notion of technology-enhanced formative assessment (TEFA) as a component for extending existing or new TEL approaches, further combining expertise from pedagogy, educational measurement, cognitive science, and information technology. A trend from dedicated to integrated and from sporadic to continuous formative assessment is envisioned. Challenging research questions will be addressed such as: How are established forms of formative assessment changing with the inclusion of technology and what new forms of formative assessment become possible? How is this reflected in new pedagogical approaches? How can today VLE support the provision of elaborated feedback?<br /><br />Position statement submissions are solicited (6 pages max. in Springer Format) that deal with approaches and innovative assessment technologies that support the transition from current assessment scenarios towards the development of e-assessment forms through which high level of meta-cognitive skills are evaluated, on-going feedback is provided, and students are more engaged in the learning process.</p>";
		s.childsessionID = "1722";
		wList.add(s);

		s = new Workshop();
		s.ID = "13";
		s.name = "Health";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "N/A";
		s.content = "<p>The eHealth sector is one of fastest growing sector today and as such, promotes the creation of various technological solutions, all of them individually facing similar challenges and dilemmas. This workshop represents a space where Industry meets TEL projects for discussing how to concretely exploit projects? outcomes and experiences into real-world health and emergency practice and how to concretely and effectively make eHealth work. Through a discussion on concrete business scenarios and on state of the art technology solutions, together with healthcare and emergency practitioners, this workshop represents a bridge between research and market needs. Participants will reflect on sustainable solutions that guarantee a high impact in real working settings: this workshop is conceived for people creating solutions to present their work to people from practice interested in these solutions and viceversa. MIRROR, ImREAL and Rehab@Home, the supporting projects, invite 8 other projects to join and contribute with their results.</p>";
		s.childsessionID = "1715";
		wList.add(s);
		
		
		return wList;
	}
	public ArrayList<Session> loadSessions(){
		ArrayList<Session> sList = new ArrayList<Session>();
		Session s;


		s = new Session();
		s.ID = "1678";
		s.name = "Project Meetings";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1679";
		s.name = "Plenary Session 2";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "09:00";
		s.endTime = "10:00";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1680";
		s.name = "Coffee Break";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "10:00";
		s.endTime = "10:30";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1681";
		s.name = "CulTEL 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "Hermes";
		sList.add(s);

		s = new Session();
		s.ID = "1682";
		s.name = "ARTEL 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "Aphrodite-A";
		sList.add(s);

		s = new Session();
		s.ID = "1683";
		s.name = "Creativity(CCL)";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "Athena";
		sList.add(s);

		s = new Session();
		s.ID = "1684";
		s.name = "CulTEL 2";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "Hermes";
		sList.add(s);

		s = new Session();
		s.ID = "1685";
		s.name = "ARTEL 2";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "Aphrodite-A";
		sList.add(s);

		s = new Session();
		s.ID = "1686";
		s.name = "Scientific Session - Learning Together - Chair: Michael Prilla";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "10:30";
		s.endTime = "12:30";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1687";
		s.name = "Industry Session 1";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "10:30";
		s.endTime = "12:30";
		s.room = "Akamas-C";
		sList.add(s);

		s = new Session();
		s.ID = "1688";
		s.name = "Lunch";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "12:30";
		s.endTime = "13:30";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1689";
		s.name = "Scientific Session - Towards New Classrooms - Chair: Ulrich Hoppe";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "13:30";
		s.endTime = "15:30";
		s.room = "Akamas-B";
		sList.add(s);

		s = new Session();
		s.ID = "1690";
		s.name = "Industry Session 2";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "13:30";
		s.endTime = "15:30";
		s.room = "Akamas-C";
		sList.add(s);

		s = new Session();
		s.ID = "1691";
		s.name = "Coffee Break";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "16:00";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1692";
		s.name = "Demo Sprint Contest";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "16:00";
		s.endTime = "18:30";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1693";
		s.name = "Conference Dinner";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "19:30";
		s.endTime = "21:30";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1694";
		s.name = "EATEL Meeting";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "18:30";
		s.endTime = "19:30";
		s.room = "Leda";
		sList.add(s);

		s = new Session();
		s.ID = "1695";
		s.name = "Plenary Session 3";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "09:00";
		s.endTime = "10:00";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1696";
		s.name = "Coffee Break";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "10:00";
		s.endTime = "10:30";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1697";
		s.name = "Lunch";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "12:30";
		s.endTime = "13:30";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1698";
		s.name = "Scientific Session - Learning Design - Chair: Mike Sharples";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "10:30";
		s.endTime = "12:30";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1699";
		s.name = "Coffee Break";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "15:30";
		s.endTime = "16:00";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1700";
		s.name = "Plenary Session 4";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "16:00";
		s.endTime = "17:30";
		s.room = "Christian Barnard";
		sList.add(s);

		s = new Session();
		s.ID = "1701";
		s.name = "Closing";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "17:30";
		s.endTime = "18:00";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1702";
		s.name = "Scientific Session - Learning at the Workplace - Chair: Kai Pata";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "13:30";
		s.endTime = "15:30";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1703";
		s.name = "Scientific Session - Massive Open Online Learning - Chair: Carlos Delgado-Kloos";
		s.date = "Thursday, September 19";
		s.day_id = "3";
		s.beginTime = "10:30";
		s.endTime = "12:30";
		s.room = "Akamas-B";
		sList.add(s);

		s = new Session();
		s.ID = "1704";
		s.name = "Scientific Session - Games - Serious and Fun - Chair: Sonja Hetzner";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "10:30";
		s.endTime = "12:30";
		s.room = "Akamas-B";
		sList.add(s);

		s = new Session();
		s.ID = "1705";
		s.name = "Scientific Session - Personalization and Adaptation (I) - Chair: Vania Dimitrova";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "10:30";
		s.endTime = "12:30";
		s.room = "Akamas-C";
		sList.add(s);

		s = new Session();
		s.ID = "1706";
		s.name = "Scientific Session - Mobile Learning - Chair: John Cook";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "13:30";
		s.endTime = "15:30";
		s.room = "Christian Barnard";
		sList.add(s);

		s = new Session();
		s.ID = "1707";
		s.name = "Scientific Session - Larger Scale Adoption and the TEL Community - Chair: Christoph Rensing";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "13:30";
		s.endTime = "15:30";
		s.room = "Akamas-B";
		sList.add(s);

		s = new Session();
		s.ID = "1708";
		s.name = "Scientific Session - Personalization and adaptation (II), Metacognition and Reflection - Chair: Peter Brusilovsky";
		s.date = "Friday, September 20";
		s.day_id = "4";
		s.beginTime = "13:30";
		s.endTime = "15:30";
		s.room = "Akamas-C";
		sList.add(s);

		s = new Session();
		s.ID = "1709";
		s.name = "Coffee Break";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "15:30";
		s.endTime = "16:00";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1710";
		s.name = "Plenary Session 1";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "16:00";
		s.endTime = "17:00";
		s.room = "Akamas-A";
		sList.add(s);

		s = new Session();
		s.ID = "1711";
		s.name = "Poster/Demo Exhibition";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "17:00";
		s.endTime = "20:30";
		s.room = "Christian Barnard";
		sList.add(s);

		s = new Session();
		s.ID = "1712";
		s.name = "WEILER";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "Hermes";
		sList.add(s);

		s = new Session();
		s.ID = "1713";
		s.name = "IWTA";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "Athena";
		sList.add(s);

		s = new Session();
		s.ID = "1714";
		s.name = "MATEL 2";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "Akamas-C";
		sList.add(s);

		s = new Session();
		s.ID = "1715";
		s.name = "Health";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "Leda";
		sList.add(s);

		s = new Session();
		s.ID = "1716";
		s.name = "Doctoral Consortium 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "09:00";
		s.endTime = "14:30";
		s.room = "Aphrodite-B";
		sList.add(s);

		s = new Session();
		s.ID = "1717";
		s.name = "Project Meetings";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1718";
		s.name = "Doctoral Consortium 2";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "Aphrodite-B";
		sList.add(s);

		s = new Session();
		s.ID = "1719";
		s.name = "Tutorial: ISG Assessment";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "12:30";
		s.room = "Aphrodite-A";
		sList.add(s);

		s = new Session();
		s.ID = "1720";
		s.name = "TEFA 2";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "Zeus";
		sList.add(s);

		s = new Session();
		s.ID = "1721";
		s.name = "Doctoral Consortium 3";
		s.date = "Wednesday, September 18";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "15:30";
		s.room = "Aphrodite-B";
		sList.add(s);

		s = new Session();
		s.ID = "1722";
		s.name = "TEFA 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		sList.add(s);

		s = new Session();
		s.ID = "1723";
		s.name = "MATEL 1";
		s.date = "Tuesday, September 17";
		s.day_id = "1";
		s.beginTime = "14:30";
		s.endTime = "18:00";
		s.room = "N/A";
		sList.add(s);






					
		return sList;
	}
	public ArrayList<Paper> loadPapers(){
		ArrayList<Paper> pList = new ArrayList<Paper>();
		Paper p;
		
		p = new Paper();
		p.id = "8437";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5465";
		pList.add(p);

		p = new Paper();
		p.id = "8438";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1708";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5466";
		pList.add(p);

		p = new Paper();
		p.id = "8439";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5467";
		pList.add(p);

		p = new Paper();
		p.id = "8440";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1703";
		p.exactbeginTime = "10:30";
		p.exactendTime = "11:00";
		p.presentationID = "5468";
		pList.add(p);

		p = new Paper();
		p.id = "8494";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1698";
		p.exactbeginTime = "12:15";
		p.exactendTime = "12:30";
		p.presentationID = "5469";
		pList.add(p);

		p = new Paper();
		p.id = "8443";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5470";
		pList.add(p);

		p = new Paper();
		p.id = "8444";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5471";
		pList.add(p);

		p = new Paper();
		p.id = "8445";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5472";
		pList.add(p);

		p = new Paper();
		p.id = "8528";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1707";
		p.exactbeginTime = "13:30";
		p.exactendTime = "13:45";
		p.presentationID = "5473";
		pList.add(p);

		p = new Paper();
		p.id = "8447";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1702";
		p.exactbeginTime = "13:30";
		p.exactendTime = "14:00";
		p.presentationID = "5474";
		pList.add(p);

		p = new Paper();
		p.id = "8448";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5475";
		pList.add(p);

		p = new Paper();
		p.id = "8449";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5476";
		pList.add(p);

		p = new Paper();
		p.id = "8452";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5477";
		pList.add(p);

		p = new Paper();
		p.id = "8453";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5478";
		pList.add(p);

		p = new Paper();
		p.id = "8454";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1707";
		p.exactbeginTime = "14:45";
		p.exactendTime = "15:00";
		p.presentationID = "5479";
		pList.add(p);

		p = new Paper();
		p.id = "8456";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1706";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5480";
		pList.add(p);

		p = new Paper();
		p.id = "8540";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1689";
		p.exactbeginTime = "15:15";
		p.exactendTime = "15:30";
		p.presentationID = "5481";
		pList.add(p);

		p = new Paper();
		p.id = "8458";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5482";
		pList.add(p);

		p = new Paper();
		p.id = "8459";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5483";
		pList.add(p);

		p = new Paper();
		p.id = "8460";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5484";
		pList.add(p);

		p = new Paper();
		p.id = "8461";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5485";
		pList.add(p);

		p = new Paper();
		p.id = "8462";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5486";
		pList.add(p);

		p = new Paper();
		p.id = "8463";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5487";
		pList.add(p);

		p = new Paper();
		p.id = "8464";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1705";
		p.exactbeginTime = "10:30";
		p.exactendTime = "11:00";
		p.presentationID = "5488";
		pList.add(p);

		p = new Paper();
		p.id = "8465";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1707";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5489";
		pList.add(p);

		p = new Paper();
		p.id = "8466";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5490";
		pList.add(p);

		p = new Paper();
		p.id = "8467";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5491";
		pList.add(p);

		p = new Paper();
		p.id = "8468";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1689";
		p.exactbeginTime = "13:30";
		p.exactendTime = "14:00";
		p.presentationID = "5492";
		pList.add(p);

		p = new Paper();
		p.id = "8470";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5493";
		pList.add(p);

		p = new Paper();
		p.id = "8472";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1704";
		p.exactbeginTime = "10:30";
		p.exactendTime = "11:00";
		p.presentationID = "5494";
		pList.add(p);

		p = new Paper();
		p.id = "8473";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1705";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:15";
		p.presentationID = "5495";
		pList.add(p);

		p = new Paper();
		p.id = "8474";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5496";
		pList.add(p);

		p = new Paper();
		p.id = "8475";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5497";
		pList.add(p);

		p = new Paper();
		p.id = "8476";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5498";
		pList.add(p);

		p = new Paper();
		p.id = "8478";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1698";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5499";
		pList.add(p);

		p = new Paper();
		p.id = "8479";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1708";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:15";
		p.presentationID = "5500";
		pList.add(p);

		p = new Paper();
		p.id = "8480";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1705";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5501";
		pList.add(p);

		p = new Paper();
		p.id = "8481";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5502";
		pList.add(p);

		p = new Paper();
		p.id = "8483";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5503";
		pList.add(p);

		p = new Paper();
		p.id = "8484";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1686";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5504";
		pList.add(p);

		p = new Paper();
		p.id = "8485";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5505";
		pList.add(p);

		p = new Paper();
		p.id = "8534";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1703";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5506";
		pList.add(p);

		p = new Paper();
		p.id = "8487";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5507";
		pList.add(p);

		p = new Paper();
		p.id = "8488";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1706";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:15";
		p.presentationID = "5508";
		pList.add(p);

		p = new Paper();
		p.id = "8489";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1706";
		p.exactbeginTime = "13:30";
		p.exactendTime = "14:00";
		p.presentationID = "5509";
		pList.add(p);

		p = new Paper();
		p.id = "8491";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5510";
		pList.add(p);

		p = new Paper();
		p.id = "8492";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5511";
		pList.add(p);

		p = new Paper();
		p.id = "8493";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1703";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5512";
		pList.add(p);

		p = new Paper();
		p.id = "8441";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1702";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:15";
		p.presentationID = "5513";
		pList.add(p);

		p = new Paper();
		p.id = "8495";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1706";
		p.exactbeginTime = "15:15";
		p.exactendTime = "15:30";
		p.presentationID = "5514";
		pList.add(p);

		p = new Paper();
		p.id = "8497";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1704";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5515";
		pList.add(p);

		p = new Paper();
		p.id = "8498";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1698";
		p.exactbeginTime = "10:30";
		p.exactendTime = "11:00";
		p.presentationID = "5516";
		pList.add(p);

		p = new Paper();
		p.id = "8499";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5517";
		pList.add(p);

		p = new Paper();
		p.id = "8500";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5518";
		pList.add(p);

		p = new Paper();
		p.id = "8501";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1705";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5519";
		pList.add(p);

		p = new Paper();
		p.id = "8502";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5520";
		pList.add(p);

		p = new Paper();
		p.id = "8503";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1686";
		p.exactbeginTime = "10:30";
		p.exactendTime = "11:00";
		p.presentationID = "5521";
		pList.add(p);

		p = new Paper();
		p.id = "8504";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1702";
		p.exactbeginTime = "15:15";
		p.exactendTime = "15:30";
		p.presentationID = "5522";
		pList.add(p);

		p = new Paper();
		p.id = "8505";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1707";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5523";
		pList.add(p);

		p = new Paper();
		p.id = "8506";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1704";
		p.exactbeginTime = "12:15";
		p.exactendTime = "12:30";
		p.presentationID = "5524";
		pList.add(p);

		p = new Paper();
		p.id = "8508";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1708";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5525";
		pList.add(p);

		p = new Paper();
		p.id = "8509";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1689";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5526";
		pList.add(p);

		p = new Paper();
		p.id = "8510";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1686";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5527";
		pList.add(p);

		p = new Paper();
		p.id = "8511";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1702";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5528";
		pList.add(p);

		p = new Paper();
		p.id = "8512";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5529";
		pList.add(p);

		p = new Paper();
		p.id = "8513";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1708";
		p.exactbeginTime = "13:30";
		p.exactendTime = "14:00";
		p.presentationID = "5530";
		pList.add(p);

		p = new Paper();
		p.id = "8514";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1705";
		p.exactbeginTime = "12:15";
		p.exactendTime = "12:30";
		p.presentationID = "5531";
		pList.add(p);

		p = new Paper();
		p.id = "8515";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5532";
		pList.add(p);

		p = new Paper();
		p.id = "8516";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1704";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:15";
		p.presentationID = "5533";
		pList.add(p);

		p = new Paper();
		p.id = "8517";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1702";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5534";
		pList.add(p);

		p = new Paper();
		p.id = "8518";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5535";
		pList.add(p);

		p = new Paper();
		p.id = "8519";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5536";
		pList.add(p);

		p = new Paper();
		p.id = "8521";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5537";
		pList.add(p);

		p = new Paper();
		p.id = "8522";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1686";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5538";
		pList.add(p);

		p = new Paper();
		p.id = "8523";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1698";
		p.exactbeginTime = "11:45";
		p.exactendTime = "12:00";
		p.presentationID = "5539";
		pList.add(p);

		p = new Paper();
		p.id = "8446";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1698";
		p.exactbeginTime = "11:30";
		p.exactendTime = "11:45";
		p.presentationID = "5540";
		pList.add(p);

		p = new Paper();
		p.id = "8525";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1706";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5541";
		pList.add(p);

		p = new Paper();
		p.id = "8526";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5542";
		pList.add(p);

		p = new Paper();
		p.id = "8527";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5543";
		pList.add(p);

		p = new Paper();
		p.id = "8524";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1698";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:15";
		p.presentationID = "5544";
		pList.add(p);

		p = new Paper();
		p.id = "8529";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5545";
		pList.add(p);

		p = new Paper();
		p.id = "8530";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1704";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5546";
		pList.add(p);

		p = new Paper();
		p.id = "8531";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5547";
		pList.add(p);

		p = new Paper();
		p.id = "8532";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5548";
		pList.add(p);

		p = new Paper();
		p.id = "8486";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1703";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5549";
		pList.add(p);

		p = new Paper();
		p.id = "8535";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5550";
		pList.add(p);

		p = new Paper();
		p.id = "8537";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1707";
		p.exactbeginTime = "14:30";
		p.exactendTime = "14:45";
		p.presentationID = "5551";
		pList.add(p);

		p = new Paper();
		p.id = "8538";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1689";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5552";
		pList.add(p);

		p = new Paper();
		p.id = "8457";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1689";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:15";
		p.presentationID = "5553";
		pList.add(p);

		p = new Paper();
		p.id = "8541";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5554";
		pList.add(p);

		p = new Paper();
		p.id = "8542";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5555";
		pList.add(p);

		p = new Paper();
		p.id = "8822";
		p.date = "Thursday, September 19";
		p.day_id = "3";
		p.type = "Keynote";
		p.belongToSessionID = "1679";
		p.exactbeginTime = "09:00";
		p.exactendTime = "10:00";
		p.presentationID = "5557";
		pList.add(p);

		p = new Paper();
		p.id = "8596";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1681";
		p.exactbeginTime = "09:00";
		p.exactendTime = "14:30";
		p.presentationID = "5559";
		pList.add(p);

		p = new Paper();
		p.id = "8593";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1682";
		p.exactbeginTime = "09:00";
		p.exactendTime = "14:30";
		p.presentationID = "5560";
		pList.add(p);

		p = new Paper();
		p.id = "8595";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1683";
		p.exactbeginTime = "09:00";
		p.exactendTime = "14:30";
		p.presentationID = "5561";
		pList.add(p);

		p = new Paper();
		p.id = "8596";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1684";
		p.exactbeginTime = "14:30";
		p.exactendTime = "18:00";
		p.presentationID = "5562";
		pList.add(p);

		p = new Paper();
		p.id = "8593";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1685";
		p.exactbeginTime = "14:30";
		p.exactendTime = "18:00";
		p.presentationID = "5563";
		pList.add(p);

		p = new Paper();
		p.id = "8823";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Keynote";
		p.belongToSessionID = "1710";
		p.exactbeginTime = "16:00";
		p.exactendTime = "17:00";
		p.presentationID = "5578";
		pList.add(p);

		p = new Paper();
		p.id = "8598";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1712";
		p.exactbeginTime = "09:00";
		p.exactendTime = "15:30";
		p.presentationID = "5579";
		pList.add(p);

		p = new Paper();
		p.id = "8599";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1713";
		p.exactbeginTime = "09:00";
		p.exactendTime = "15:30";
		p.presentationID = "5580";
		pList.add(p);

		p = new Paper();
		p.id = "8600";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1714";
		p.exactbeginTime = "09:00";
		p.exactendTime = "15:30";
		p.presentationID = "5581";
		pList.add(p);

		p = new Paper();
		p.id = "8602";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1715";
		p.exactbeginTime = "09:00";
		p.exactendTime = "15:30";
		p.presentationID = "5582";
		pList.add(p);

		p = new Paper();
		p.id = "8594";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1719";
		p.exactbeginTime = "09:00";
		p.exactendTime = "12:30";
		p.presentationID = "5586";
		pList.add(p);

		p = new Paper();
		p.id = "8601";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1720";
		p.exactbeginTime = "09:00";
		p.exactendTime = "15:30";
		p.presentationID = "5587";
		pList.add(p);

		p = new Paper();
		p.id = "8601";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1722";
		p.exactbeginTime = "14:30";
		p.exactendTime = "18:00";
		p.presentationID = "5589";
		pList.add(p);

		p = new Paper();
		p.id = "8600";
		p.date = "Tuesday, September 17";
		p.day_id = "1";
		p.type = "Workshop";
		p.belongToSessionID = "1723";
		p.exactbeginTime = "14:30";
		p.exactendTime = "18:00";
		p.presentationID = "5590";
		pList.add(p);

		p = new Paper();
		p.id = "8578";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5591";
		pList.add(p);

		p = new Paper();
		p.id = "8579";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5592";
		pList.add(p);

		p = new Paper();
		p.id = "8580";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5593";
		pList.add(p);

		p = new Paper();
		p.id = "8581";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5594";
		pList.add(p);

		p = new Paper();
		p.id = "8582";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5595";
		pList.add(p);

		p = new Paper();
		p.id = "8583";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5596";
		pList.add(p);

		p = new Paper();
		p.id = "8584";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5597";
		pList.add(p);

		p = new Paper();
		p.id = "8585";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Demo";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5598";
		pList.add(p);

		p = new Paper();
		p.id = "8586";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5599";
		pList.add(p);

		p = new Paper();
		p.id = "8587";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5600";
		pList.add(p);

		p = new Paper();
		p.id = "8588";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5601";
		pList.add(p);

		p = new Paper();
		p.id = "8589";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5602";
		pList.add(p);

		p = new Paper();
		p.id = "8590";
		p.date = "Wednesday, September 18";
		p.day_id = "2";
		p.type = "Poster";
		p.belongToSessionID = "1711";
		p.exactbeginTime = "17:00";
		p.exactendTime = "20:30";
		p.presentationID = "5603";
		pList.add(p);

		p = new Paper();
		p.id = "8591";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1708";
		p.exactbeginTime = "15:15";
		p.exactendTime = "15:30";
		p.presentationID = "5604";
		pList.add(p);

		p = new Paper();
		p.id = "8824";
		p.date = "Friday, September 20";
		p.day_id = "4";
		p.type = "Keynote";
		p.belongToSessionID = "1695";
		p.exactbeginTime = "09:00";
		p.exactendTime = "10:00";
		p.presentationID = "5874";
		pList.add(p);




		return pList;
	}
	public ArrayList<PaperContent> loadPaperContents(){
		ArrayList<PaperContent> pList = new ArrayList<PaperContent>();
		PaperContent p;
		
		p = new PaperContent();
		p.id = "8437";
		p.type = "Poster";
		p.authors = "Isa Jahnke, Lars Norqvist, Andreas Olsson";
		p.title = "The Odder Experience on iPads in Schools: Reflecting on Digital Didactical Designs";
		p.paperAbstract = "<p style='text-align: justify;'>This research explores teaching in schools using mobile technology. We studied digital didactical designs in co-located settings (mobile technologies in physical classrooms). It could be that the iPad is a substitute for textbooks or laptops. It also could be that the teachers create new didactical designs to support deep learning instead of surface levels (remembering facts) only. Classroom observations and qualitative data were collected in a Danish community where 200 teachers and 2,000 students aged 6-16 use iPads in classrooms. Based on the theoretical framework Digital Didactics and following the innovative designs, three key aspects could be explored: The teachers? digital didactical designs embrace a) new learning goals where more than one correct answer exists, b) focus on producing knowledge in informal-in-formal learning spaces, c) making learning visible in different products (text, comics, podcasts etc.). The results show the necessity of rethinking traditional Didaktik towards Digital Didactical Designs.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_76";
		pList.add(p);

		p = new PaperContent();
		p.id = "8438";
		p.type = "Full Paper";
		p.authors = "Tobias Ley, Barbara Kump";
		p.title = "Which User Interactions Predict the Level of Topical Expertise in Work-integrated Learning?";
		p.paperAbstract = "<p style='text-align: justify;'>Predicting knowledge levels from user?s implicit interactions with an adaptive system is a difficult task, particularly in learning systems that are used in the context of daily work tasks. We have collected interactions of six persons working with the adaptive work-integrated learning system APOSDLE over a period of 2 months to find out which types of naturally occurring interactions can be used to predict their level of topical expertise. One set of interactions is based on the tasks they performed, the other on a number of additional Knowledge Indicating Events (KIE). We find that the addition of KIE significantly improves the prediction as compared to using tasks only. Both approaches are superior to a model that uses only the frequencies of events.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8439";
		p.type = "Demo";
		p.authors = "Susan Bull, Michael Kickmeier-Rust, Ravi Vatrapu, Matthew D. Johnson, Klaus Hammermueller, William Byrne, Luis Hernandez-Munoz, Fabrizio Giorgini, Gerhilde Meissl-Egghart";
		p.title = "Learning, Learning Analytics, Activity Visualisation and Open Learner Model: Confusing?";
		p.paperAbstract = "<p style='text-align: justify;'>This paper draws on the range of visualisation approaches in the activity/learning side of learning analytics. It considers how visualisations can come together in practice, and suggests that teachers and learners use an open learner model approach in situations where many tools and many activity visualisations produce more visual information than can be readily interpreted.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_51";
		pList.add(p);

		p = new PaperContent();
		p.id = "8440";
		p.type = "Full Paper";
		p.authors = "Carlos Alario-Hoyos, Mar Perez-Sanagustin, Carlos Delgado Kloos, Hugo A. Parada G., Mario Muñoz-Organero, Antonio Rodríguez-De-Las-Heras";
		p.title = "Analysing the impact of built-in and external Social Tools in a MOOC on Educational Technologies";
		p.paperAbstract = "<p style='text-align: justify;'>MOOCs have been a disruptive educational trend in the last months. Some MOOCs just replicate traditional teaching pedagogies, adding multimedia elements like video lectures. Others go beyond, trying to engage the massive number of participants by promoting discussions and relying on their contributions to the course. MOOC platforms usually provide some built-in social tools for this purpose, although instructors or participants may suggest others to foster discussions and crowdsourcing. This paper analyses the impact of two built-in (Q&A and forum) and three external social tools (Facebook, Twitter and MentorMob) in a six-week MOOC on educational technologies. Most of the participants agreed on the importance of social tools to be in touch with their partners and share information related to the course, the forum being the one preferred. Furthermore, the lessons learned from the enactment of this MOOC employing social tools are summarized so that others may benefit from them.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_2";
		pList.add(p);

		p = new PaperContent();
		p.id = "8441";
		p.type = "Short Paper";
		p.authors = "Teresa Holocher-Ertl, Christine Kunzmann, Lars Müller, Verónica Rivera-Pelayo, Andreas Schmidt";
		p.title = "Motivational & Affective Aspects in Technology Enhanced Learning: Topics, Results, and Research Route";
		p.paperAbstract = "<p style='text-align: justify;'>Motivational and affective aspects have long been neglected in research and development of technology-enhanced learning solutions, but it is now increasingly recognized that they are key to acceptance and sustainable success. However, the consideration of these aspects still suffers from fragmented research activities that are in between established disciplines. In this paper, we analyze and summarize the results from three editions of the EC-TEL workshop series MATEL, which has established a forum for interdisciplinary conversations and stimulates joint research activities. From a wide range of projects presented at the workshops, an overview of current research and its findings is presented and systematized. The workshop series has also included extensive interactive sessions in which a landscape for the topic area has been created and prioritized research challenges have been identified. Based on an analysis of these results, the paper concludes with a research agenda that advances the inclusion of motivational and affective aspects into technology enhanced learning from art to an engineering approach.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_39";
		pList.add(p);

		p = new PaperContent();
		p.id = "8443";
		p.type = "Poster";
		p.authors = "Eileen Scanlon, Grainne Conole, Gill Clough, Canan Blake";
		p.title = "Interdisciplinary knowledge creation in Technology Enhanced Learning";
		p.paperAbstract = "<p style='text-align: justify;'>The impact of the Internet on working practices has been profound, in terms of how people communicate, collaborate and network. In parallel, there has being increasing prominence given to interdisciplinarity as a means of addressing cross-disciplinary research challenges (Klein, 1990, TLRP, 2009). This paper explores how interdisciplinary research can make better use of new technologies as a means of developing shared understanding. Interdisciplinary projects investigating Technology-Enhanced Learning (TEL) make a particularly relevant site for such research. The issues raised in this investigation on working in an interdisciplinary fashion in TEL are illustrated with reference to some research projects. We will report on the interdisciplinary challenges faced by the Personal Inquiry Project (PI), which was conducted by the Open University and University of Nottingham (http://www.pi-project.ac.uk). It aims to help school students learn the skills of evidence-based inquiry (Collins et al., 2008, Scanlon et al., 2009). We have found that a key means of support for the development of work on this interdisciplinary project is the development of mediating artefacts (Conole, 2008) to support the articulation and process of discourse. The development of mediating artefacts has also featured as part of the xDelia (Excellence in Decision-making through Enhanced Learning in Immersive Applications) project(http:// www.xdelia.org). The project addresses the use of wearable sensors and serious games to identify and address the effects of emotional regulation in financial decision making in traders, investors or members of the public making personal finance decisions. Researchers in seven institutions with expertise in financial decision making, games design, cognitive science, bio-sensor technologies and educational technology are collaborating. To make this interdisciplinary project work we have developed methods to help us achieve a shared understanding of common goals and of what each research team can contribute. We will locate our findings in the wider literature on interdisciplinary working.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_86";
		pList.add(p);

		p = new PaperContent();
		p.id = "8444";
		p.type = "Poster";
		p.authors = "Mar Perez-Sanagustin, Javier Melero, Davinia Hernández-Leo, Carlos Delgado Kloos, Josep Blat";
		p.title = "Transforming the campus into a digitally augmented learning space using etiquetAR";
		p.paperAbstract = "<p style='text-align: justify;'>Tagging technologies such as QR codes offer outstanding possibilities for transforming spaces into digitally augmented learning spaces. Tags, when attached to particular locations, add a digital layer of information that transforms the physical surrounding extending users? learning experience. Although there are tools for generating QR codes, to the best of our knowledge, there are no tools oriented towards learning purposes, limiting the adoption of this technology in educational contexts. We present etiquetAR, a web-authoring application to create and manage personalized tags for augmenting spaces. etiquetAR has been applied in an exploratory user study to augment a University Campus for supporting Bachelor-dependent a gamified activities to learn about particular campus areas and services. The activities shared the same QR codes, but change behavior depending on the profile of the student interacting with the tag. The results show the successful application of etiquetAR and illustrate its benefits to support tag-based situated activities.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_83";
		pList.add(p);

		p = new PaperContent();
		p.id = "8445";
		p.type = "Poster";
		p.authors = "Valentina Bartalesi, Maria Claudia Buzzi, Marina Buzzi, Barbara Leporini, Caterina Senette";
		p.title = "Monitoring Learning in ABA Teaching of Children with Autism";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper we present a web application for analyzing data collected during educational technology-enhanced sessions performed by children with autism. The tool automatically extracts, aggregates and visualizes the children?s performance data gathered from the didactic sessions, to facilitate the updated monitoring of children over time and enable continuous tuning of the intervention. Extracted data can be visualized through tables and graphics, al-lowing the user to further explore them in an interactive modality. The tool was designed involving educators from the earliest phase of the design, in order to define analysis parameters and discover new monitoring functions derivable from the enormous amount of automatically collected data. The educators were also involved in the test phases to improve the usability of the system. Although the tool is visually oriented, the user interfaces have been implemented to be accessible to visually impaired users as well.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_67";
		pList.add(p);

		p = new PaperContent();
		p.id = "8446";
		p.type = "Full Paper";
		p.authors = "Nils Malzahn, Tina Ganster, Nicole Sträfling, Nicole Kramer, H. Ulrich Hoppe";
		p.title = "Motivating Students or Teachers? Challenges for a successful Implementation of Online-Learning in Industry-Related Vocational Training";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper we present our findings from the FoodWeb2.0 project about success indicators and restraints while implementing Web2.0 based learning processes. We conducted two courses with the same content with two different target groups from the German food industry: one with regular employees and one with teachers of dedicated education facilities. Comparing the performance of the two courses triangulating methods from Social Network Analysis and quantitative and qualitative surveys, we identified indicators for the successful implementation and differences in the motivation of learners and teachers. These findings illustrate the need for strategies involving and motivating teachers, when introducing modern learning methods and tools within the food industry and other related branches.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_16";
		pList.add(p);

		p = new PaperContent();
		p.id = "8447";
		p.type = "Full Paper";
		p.authors = "Dirk Borner, Marco Kalz, Stefaan Ternier, Marcus Specht";
		p.title = "Pervasive interventions to increase pro-environmental awareness, consciousness, and learning at the workplace";
		p.paperAbstract = "<p style='text-align: justify;'>This paper reports about pervasive interventions at a university campus to increase the pro-environmental awareness, consciousness, and learning of employees. Based on an assessment of the research gaps in this problem area we present results and design implications from three intervention iterations. While in the first intervention the focus was on increasing awareness through information distribution with ambient learning displays on the campus, the second iteration provided personalised feedback to employees with the help of a sensor network and different client applications. The third iteration then implemented a game-based learning concept. Results reveal that these approaches are effective on different levels and that a combination of these elements can lead to increased pro-environmental consciousness, learning and hopefully a sustained behaviour change of employees.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_6";
		pList.add(p);

		p = new PaperContent();
		p.id = "8448";
		p.type = "Demo";
		p.authors = "Benedicte Talon, Insaf Kerkeni, Sabra Tliche, Henda Belaid-Ajroud";
		p.title = "Tracking a collaborative learning environment: Analysis, design and development of a multi-agent system";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper, we present a system that has been developed to trace activities in a collaborative learning environment. These traces are necessary to help the teacher to monitor the activities in an environment dedicated to project-based learning and allow learners to identify their participation in the collective work. We also need traces to assist in the evaluation of the device. Indeed, knowing how the system has been really used facilitates its revision. The tracing system is implemented as a multi-agents system. In this paper, we present at first the context and motivation of our work. Then, in a review of literature, we define different concepts relative to traceability such as traces and indicators. We then describe our needs concerning traces and indicators. Next, we present the tracking system. We conclude with the different perspectives of this work.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_65";
		pList.add(p);

		p = new PaperContent();
		p.id = "8449";
		p.type = "Demo";
		p.authors = "Dirk Borner, Stefaan Ternier, Roland Klemke, Birgit Schmitz, Marco Kalz, Bernardo Tabuenca, Marcus Specht";
		p.title = "ARLearn ? Open source application platform for mobile learning";
		p.paperAbstract = "<p style='text-align: justify;'>The paper presents and outlines the demonstration of an open source application platform for designing, supporting, and evaluating mobile learning scenarios that make use of media artefacts in a specific context. The platform contains a web-based authoring environment, cross-platform mobile applications to run the scenarios, as well as tools to monitor progress and results. Besides exploring the pedagogical background, the paper describes the conceptual implementation as well as the technical infrastructure and lists the requirements for demonstrating the platform and all its components.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_52";
		pList.add(p);

		p = new PaperContent();
		p.id = "8452";
		p.type = "Poster";
		p.authors = "Niroshan Thillainathan, Holger Hoffmann, Eike M. Hirdes, Jan Marco Leimeister";
		p.title = "Enabling Educators to design Serious Games ? A Serious Game Logic and Structure Modeling Language (GLiSMo)";
		p.paperAbstract = "<p style='text-align: justify;'>Serious games have become a big asset in education. The interplay of education and gameplay helps motivate players and enhance their learning success. To create successful serious games, it is necessary to combine programming knowledge ?for game development? and didactical knowledge ?to properly include learning objectives. In our research, we focus on a solution that allows educators with no programming skills to still create didactically sound serious games. Our idea is to provide educators with a visual design tool and model driven development techniques, that allow the generation of games from visual models. In this paper, we describe the first steps towards this goal, the design of the Serious Game Logic and Structure Modeling Language (GLiSMo). To design GLiSMo, we identified requirements for the development of serious games and derived language elements from them. We show the feasibility and applicability of GLiSMo by modeling an exemplary serious game scenario.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_92";
		pList.add(p);

		p = new PaperContent();
		p.id = "8453";
		p.type = "Demo";
		p.authors = "Davinia Hernández-Leo, Raul Nieves, Juan Pablo Carrascal, Josep Blat";
		p.title = "Signal Orchestration System for Face-to-Face Collaborative Learning Flows";
		p.paperAbstract = "<p style='text-align: justify;'>This demonstration paper is focused on the Signal Orchestration System (SOS), a system that facilitates teachers the implementation of dynamic collaborative learning flows in physical spaces, such as the classroom. It is based on the use of color, haptic and sound signals to communicate changing orchestration indications of collaborative learning flows such group formation and distribution of activities, roles, collaboration areas, resources, etc. The system is composed of personal devices (worn by students), located devices (in specific physical areas), and a manager (in the teacher?s computer to define and send the signals). Experimental results indicate that the SOS enables flexible orchestration of collaborative flows, facilitates orchestration awareness, decreases the time devoted to orchestration tasks and favors teachers? and students? attention to the learning task. The demonstration outline includes the on-the-fly configuration of the manager and the participation of attendees who, wearing the personal devices, are asked to react to the orchestration signals received in their personal devices, other attendees? devices and located devices in the room.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_58";
		pList.add(p);

		p = new PaperContent();
		p.id = "8454";
		p.type = "Short Paper";
		p.authors = "Marco Kalz";
		p.title = "What happened to the crossdisciplinarity of Technology-Enhanced Learning in 2004?";
		p.paperAbstract = "<p style='text-align: justify;'>This paper analyses the crossdisciplinarity of the field of Technology-Enhanced Learning with science-overlay-maps and diversity measures. An earlier analysis revealed that the crossdisciplinarity of the field has constantly increased over the last 10 years. Only in 2004, a significant decrease of interdisciplinary research can be measured. In this paper we took a closer look at the publications of this year to test our hypothesis for the decrease of crossdisciplinarity.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_41";
		pList.add(p);

		p = new PaperContent();
		p.id = "8456";
		p.type = "Full Paper";
		p.authors = "Canan Blake, Eileen Scanlon, Alison Twiner, Trevor Collins, Ann Jones, Lucinda Kerawalla";
		p.title = "Analysis of learners? field trip talk during a collaborative inquiry task";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper we will analyse children?s field trip talk with a view to understand how a technology enhanced inquiry learning tool kit play a part in enriching collaboration during a field trip and facilitates social interaction. The participants in the study were 15 year-old students carrying out their geography GCSE (General Certificate in Secondary Education) work in a secondary school in the UK. During the field trip, we provided students with nQuire, an inquiry learning tool kit to orchestrate their learning, in an ultra-mobile Asus Eee PC with a wireless connection to the coursework web site. Students collected data from two points in two towns with very different layout and land use. The learning environment (a computer supported collaborative learning environment) created with nQuire tool kit, ultra mobile PCs, personalised inquiry task and the use of scientific sensors to collect data offers possibilities for collaboration and effective interaction. In this study we are analysing to what extent this environment supported learning collaboratively and to what extent students interacted with each other and with the technology to construct knowledge during the data collection phase of their coursework, i.e. the field trip.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_4";
		pList.add(p);

		p = new PaperContent();
		p.id = "8457";
		p.type = "Short Paper";
		p.authors = "Peter Bergstrom, Stina Årebrant";
		p.title = "The student-role in the one-to-one computing classroom: Tensions between teacher-centred learning and student-centred learning";
		p.paperAbstract = "<p style='text-align: justify;'>One-to-one (1:1) computing has recently been scaled up and integrated into learning strategies, but there have been few studies on this so far. This explorative observation and interview study aims to gain increased understanding about the role of students in 1:1 computing classrooms in upper secondary school. The results reveal a media-rich classroom based on five affordances: students? note-taking; searching the Internet; social media, communication applications; and three affordances in one situation. The five categories of affordances are discussed with reference to aspects of the student?s role based on designs of teacher-centred learning and student-centred learning. The results show a varied role for students ranging from passive to active. The study concludes that the student role is varied and spans between both the analogue and digital classroom constituting the 1:1 computing classroom.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_33";
		pList.add(p);

		p = new PaperContent();
		p.id = "8458";
		p.type = "Poster";
		p.authors = "Michael Striewe, Michael Goedicke";
		p.title = "JACK revisited: Scaling up in multiple dimensions";
		p.paperAbstract = "<p style='text-align: justify;'>In 2009 the authors of this paper published their proposal of a flexible and modular software architecture for computer aided assessments and automated marking. The publication also included first experiences from using the system JACK that implements this architecture. Since then, four more years of experience have passed. This paper reports on technical and organizational aspects of using the proposed architecture and the actual system in various scenarios, including scaling to course size, exercise size, and amount of feedback.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_88";
		pList.add(p);

		p = new PaperContent();
		p.id = "8459";
		p.type = "Demo";
		p.authors = "Fabrizio Giorgini, Peter Reimann";
		p.title = "Engaging learning technologies for the classroom of tomorrow";
		p.paperAbstract = "<p style='text-align: justify;'>Schools are slowly yet inevitably entering the information age. But while the level of technology infusion is increasing, and with it the capacity to distribute information for learning and gather information about learning quickly and efficiently, we are still far away from the vision of the school as a high performance, personalized learning community. The barrier to that is not so much the absence of information, but the absence of the right information, at the right time, in the right format. The classroom may be increasingly data-rich, but is still comparatively information-poor. One reason is that a good part of the data made available to teachers and students have limitations to inform pedagogical decision making: large-scale assessment data are usually not linked to classroom practices and outcomes, and are not available close enough in time to learning and teaching activities. And classroom technologies that are closer to real-time performance focus on activity tracking rather than on knowledge changes. The paper describes a set of inter-related methods and software components developed in NEXT-TELL integrated project co-funded by the European Commission that can be used to turn assessments into support mechanisms for learning, and to make use and sense of data for improving teaching and learning. In NEXT-TELL, we aim to contribute to classrooms where ICT is used to engage students in meaningful learning activities, and to provide teachers and students with nuanced information about learning when it is needed and in a format that is supportive of pedagogical decision making, thus optimizing the level of stimulation, challenge, and feedback density. In the project we equip teachers with an authoring tool for designing learning activity sequences and for relating these to expected knowledge changes (learning progressions) as well assessment methods. We treat any assessment process as an instantiation of an assessment model, and any learning activity sequence as an instance of a learning sequence model. Technically, we use a meta-modelling shell and the Open Models approach for modelling formative assessment processes and learning activity sequences. The models are not only descriptions, but can also serve as the basis for rapid deployment in an ICT environment. Currently, we provide adaptors to Moodle, Mahara, and to Google Apps. We call the method and the toolkit ECAAD, for Evidence-centred Activity and Assessment Design. Once an IT-based learning sequence is described in such a model (and as a side effect stored on a server), it becomes shareable (e.g., between teachers) and it constitutes a basis for technical deployment. Since the model describes the learning activities (e.g., those involved in peer writing) in some detail, the activities can be supported quickly in different software tools (e.g., Moodle, LAMS, Google Apps). And since the models specify the data that should be traced and/or requested from students during learning, it makes it easier to automatically gather and interpret log file information in terms of students? learning. Since such tracing data are sensitive due to trust and privacy issues, in NEXT-TELL all trace and log file data get stored in an e-Portfolio system (an extension of the open source tool Mahara), and are thus under student control. The student can control what to share in general, and what to share with the teacher for appraisal in particular.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_57";
		pList.add(p);

		p = new PaperContent();
		p.id = "8460";
		p.type = "Poster";
		p.authors = "Rui Costa, Ana Moura Santos";
		p.title = "IEEE-IST Academic: A web-based educational resources case-study";
		p.paperAbstract = "<p style='text-align: justify;'>The project IEEE-IST Academic is an initiative of the IEEE Student Branch at Instituto Superior Tecnico (IST) and since its beginnings (May 2012) counts with the collaboration of several professors of IST. Organized by course topics, the first Academic videos offer all undergraduate students in computer sciences, civil, electrical and mechanical engineering, and also degrees in applied mathematics and physics, just to mention a few that are part of the IST undergraduate degrees, complementary materials to most of the Mathematics undergraduate courses, Computer Sciences Introductory Course, Chemistry and Electronics. Some topics due to the enthusiasm of the invited professors, who are responsible for the contents of the videos are expanding really fast. The students technical team is responsible for the capture, processing and edition of the materials, and is also in charge of the design and back office of the IEEE-IST Academic portal. The videos are designed to be accessed from several platforms, such as: laptops, tablets, smartphones, and extensively make use of visualization and graphics 3D in order to help the learning experience. The Academic videos are designed to be more close to the courses syllabus at IST, but can easily be a future reference for other Portuguese, Brazilian and European schools of Engineering, Science and Technology, and also for other Universities in countries of Portuguese official language.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_70";
		pList.add(p);

		p = new PaperContent();
		p.id = "8461";
		p.type = "Poster";
		p.authors = "Vania Dimitrova, Christina Steiner, Dimoklis Despotakis, Paul Brna, Antonio Ascolese, Lucia Pannese, Dietrich Albert";
		p.title = "Semantic Social Sensing for Improving Simulation Environments for Learning";
		p.paperAbstract = "<p style='text-align: justify;'>. The paper presents a novel approach, called semantic social sensing (SSS). This approach is applicable to the development of immersive simulated environments for experiential learning by adults. SSS exploits ontologies and semantic augmentation to organise, link and examine social content in order to identify interesting aspects that can be brought to the attention of instruction designers to facilitate the improvement of learning environments. The paper provides a first step to effectively and efficiently gather information on simulations? actual real-world relevance and to utilise this information to improve these learning environments. The SSS approach combines automatic semantic analysis (ViewS framework) and discourse analysis of microposts produced during interactions with the learning simulator. A user trial with a simulated environment for interpersonal communication is reported. The output shows that the approach allowed organizing, grouping and comparing of user comments and, overall, provided useful information on the quality of the learning simulation and on where and how to improve the simulation scenario.An approach of making sense of user generated content as a formative evaluation instrument informing simulation developers is presented, which combines automatic semantic analysis and discourse analysis. This approach has been applied in the EC-funded ImREAL project in the context of an existing simulation for interpersonal communication in business settings. Micro-posts produced by users during usage of the learning simulator have been collected and analysed. To this end, a categorisation scheme for manual annotations of micro-posts has been developed, which provides a comprehensive insight on the different types of users' contributions. In a second step, a semantic sensing approach (the ViewS framework) has been applied, to further explore the diverse viewpoints presented in the different types of posts. Overall, this two-step analysis of user-generated content has provided useful information on the quality of the learning simulation and on where and how to improve the simulation scenario. The presented approach provides a valuable basis of application for similar evaluation purposes and for potential further semi-automation of discourse analysis.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_71";
		pList.add(p);

		p = new PaperContent();
		p.id = "8462";
		p.type = "Demo";
		p.authors = "Jesus Miguel Garcia Gorrostieta, Samuel Gonzalez Lopez, Aurelio Lopez-Lopez, Maya Carrillo";
		p.title = "An Intelligent Tutoring System to Evaluate and Advise on Lexical Richness in Students Writings";
		p.paperAbstract = "<p style='text-align: justify;'>Academic programs or courses conclude often with a thesis or research proposal written by students. Usually, the level of the document can be improved with recommendations of the advisor but this seems insufficient given the frequent overload. The guidance of students on writing is a hard and time consuming task for advisors, since requires several iterations before achieving an acceptable level. Commonly, when advising students close to graduation, most questions are about the structure of the research or thesis project. Lexical competence, i.e. the writer ability to use properly vocabulary, becomes a basic issue of the instructor. In this paper, we present a web-based intelligent tutoring system (ITS) to provide student guidance and evaluation in structuring research projects. We propose a network-based student model to follow the progress of each student in the development of the project, supply some assessments and personalized feedback on each assessment. This tutor includes a module for assessing the lexical richness, which is done in terms of three measures: lexical density, lexical variety, and sophistication. We describe these measures and provide examples of the interaction with the tutor as well as returned feedback. We also explain the methodology for pilot testing with undergraduate students. The results of the analysis of the pilot test were encouraging, indicating that the tutor indeed helps students. Moreover, students found useful the tutor system and its lexical analyzer, after a survey was applied.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_55";
		pList.add(p);

		p = new PaperContent();
		p.id = "8463";
		p.type = "Demo";
		p.authors = "Ekaterina Prasolova-Forland, Mikhail Fominykh, Ramin Darisiro";
		p.title = "Virtual Afghan Village as a Low-Cost Environment for Training Cultural Awareness in a Military Context";
		p.paperAbstract = "<p style='text-align: justify;'>3D virtual worlds, simulations, and serious games have been used for professional and military training for a long time due to their capability of providing an engaging learning experience and demonstrating concepts and situations that it is too problematic to represent efficiently and realistically in a classroom setting. An example of such a concept is operational culture. Under-standing culture is a basic component of operational planning, training, and execution. However, there is a lack of research-based methods for using and developing game-based simulations in military training. In addition, creation of such simulations has traditionally been very resource-consuming. The project Cultural Awareness in Military Operations seeks to address these challenges. The goal of the project has been to create and evaluate a low-cost game-based simulation in Second Life for training cultural awareness among military personnel in the Norwegian Armed Forces preparing for international operations. The project has also aimed at creating methodological guidelines and tools for developing 3D educational simulations for both military and civilian use.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_60";
		pList.add(p);

		p = new PaperContent();
		p.id = "8464";
		p.type = "Full Paper";
		p.authors = "Julio Guerra, Sergey Sosnovsky, Peter Brusilovsky";
		p.title = "When One Textbook is not Enough: Linking Multiple Textbooks Using Probabilistic Topic Models";
		p.paperAbstract = "<p style='text-align: justify;'>The Web-revolution in publishing and reading is rapidly increasing the volume of online textbooks. Nowadays, for most of the subjects, a selection of online textbooks is available. Such an abundance leads to an interesting opportunity: if a student does not like how a primary textbook presents a particular topic s/he can always access its alternative (e.g. more detailed or advanced) presentation elsewhere. Modern e-learning environments could better support access to different versions of instructional material by generating intelligent links between the textbooks sections that present similar topics and concepts. This paper reports an attempt to investigate the problem of fine-grained intelligent linking of online textbooks based on the probabilistic topic modeling technology. Using collections of textbooks in two domains (elementary algebra and information retrieval), we have demonstrated that intelligent linking based on probabilistic topic models produces a much better modeling quality than traditional term-based approaches.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_11";
		pList.add(p);

		p = new PaperContent();
		p.id = "8465";
		p.type = "Full Paper";
		p.authors = "Raghu Raman, Krishnashree Achuthan, Prema Nedungadi";
		p.title = "Virtual Labs in Engineering Education: Modeling perceived critical mass of potential adopter teachers.";
		p.paperAbstract = "<p style='text-align: justify;'>Virtual labs for science experiments is a multimedia technology innovation. A possible growth pattern of the perceived critical mass for virtual labs adoption is modeled using (N=240) potential-adopter teachers based on Roger?s theory of diffusion and of perceived attributes. Results indicate that perceived critical mass influences behavior intention to adopt a technology innovation like Virtual Labs and is affected by innovation characteristics like relative advantage, ease of use and compatibility. Our findings confirm that although it is difficult to pinpoint the timing of critical mass attainment for an innovation like Virtual Labs, we can model the potential-adopter teacher?s perceptions to predict whether critical mass has been reached.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_23";
		pList.add(p);

		p = new PaperContent();
		p.id = "8466";
		p.type = "Poster";
		p.authors = "Antonio Balderas, Iván Ruiz-Rube, Juan Manuel Dodero, Manuel Palomo-Duarte, Anke Berns";
		p.title = "A generative computer language to customize online learning assessments";
		p.paperAbstract = "<p style='text-align: justify;'>The focus on assessment of learning experiences has shifted from knowledge to competences. Unfortunately, assessing certain competences is mainly a subjective task, being problematic for both the evaluators and the evaluated. Additionally, when the learning process is computer-supported and the number of students increases, traditional assessment procedures suffer from scalability problems. In this paper we propose a methodology that supports grading learning competences according to students' performance in an online course. We automatically extract different objective indicators about students? work in a Learning Management System (LMS). Evaluators can use a computer programming-like language to express a number of required indicators. Such indicators are automatically extracted from the activity logs generated by the LMS. A case study with Moodle LMS-based courses is carried out to explain how such indicators can be obtained and how to analyze the assessment results.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_66";
		pList.add(p);

		p = new PaperContent();
		p.id = "8467";
		p.type = "Demo";
		p.authors = "Stergios Tegos, Stavros Demetriadis, Anastasios Karakostas";
		p.title = "MentorChat: A Teacher-Configurable Conversational Agent that Promotes Students? Productive Talk";
		p.paperAbstract = "<p style='text-align: justify;'>MentorChat is a CSCL system that utilizes a conversational pedagogical agent to engage students in fruitful collaboration. This conversational agent attempts to promote students? productive dialogue by providing unsolicited prompts aimed to elicit explicit reasoning. Using MentorChat a teacher is able to design and deploy the phases and the tasks of a collaborative activity along with the support that the agent provides. In this paper, we present (a) the theoretical background MentorChat is based on, (b) the main technical features of the system and (c) some encouraging preliminary results.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_63";
		pList.add(p);

		p = new PaperContent();
		p.id = "8468";
		p.type = "Full Paper";
		p.authors = "Antonia Cascales, Maria Laguna Segovia, David Perez-Lopez, Pascual Perona, Manuel Contero";
		p.title = "3D Interactive Applications on Tablets for Preschoolers: Exploring the Human Skeleton and the Senses";
		p.paperAbstract = "<p style='text-align: justify;'>Early childhood education is a key element for the future success of children in the education system. In this context, this paper describes the results of a pilot study with preschool children using a 3D interactive learning application on tablets. The pilot project is arranged according to a three-phase process to promote the development of: (1) emergent literacy, (2) digital access for early years learners and (3) basic concepts in knowledge of the environment. The pilot study was conducted with six classes of 87 students aged between 3 years to 6 years, over a 6-week period. During this period, the students were introduced to and engaged in the knowledge of the human skeleton and five senses by using a 3D interactive application on tablets. The quasi experimental design was based on a nonequivalent groups pre-test and post-test design. The interactive learning application was designed around three distinct interaction modes: presentation, exploration, manipulation and evaluation. The results on the normalization tests (pre-test) for both control/experimental groups before the experiment were similar. The results provided by post-test indicate that students who worked with tablets showed higher scores in all of the considered aspects.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_7";
		pList.add(p);

		p = new PaperContent();
		p.id = "8470";
		p.type = "Poster";
		p.authors = "Christos Mettouris, Achilleas P. Achilleos, George Angelos Papadopoulos";
		p.title = "A Context Modelling System and Learning Tool for Context-Aware Recommender Systems";
		p.paperAbstract = "<p style='text-align: justify;'>A critical contextual modelling issue in context-aware recommender systems research has to do with developing domain and application specific models that offer no reuse and sharing capabilities. Developers and researchers struggle to design their own models without any guidance, often resulting in overspecialized, inefficient and incomplete context models. We have proposed a generic, abstracted context modelling framework for CARS in a prior work which developers and researchers can use to be guided through the process of CARS context modelling. Based on this work we have now developed an online context modelling system and learning tool for CARS to be presented in this paper. The system is able to teach and guide CARS developers on how to build their own context models in a way that offers sharing and reuse, while at the same time it teaches them important modern concepts derived by CARS research, significantly advancing as a result their knowledge in the field.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_80";
		pList.add(p);

		p = new PaperContent();
		p.id = "8472";
		p.type = "Full Paper";
		p.authors = "Birgit Schmitz, Stefaan Ternier, Roland Klemke, Marcus Specht, Marco Kalz";
		p.title = "Designing a mobile learning game to investigate the impact of role-playing on helping behavior";
		p.paperAbstract = "<p style='text-align: justify;'>Despite research in mobile learning games has intensified over the last decade, there is relatively little research about how individual game mechanisms influence or change behaviour. This article aims at understanding the influence of the game mechanism role-playing and investigates how it can be used to alter behavioural intention. In order to do so, we designed a mobile learning game to train Basic Life Support (BLS) and Cardiopulmonary Resuscitation (CPR). With the game we aim at improving laymen?s willingness to help in case of emergency. First, we illuminate the strand of research related to role-playing in the context of BLS and bystander CPR. Second, we describe the pedagogical framework of the mobile learning game that was designed to train BLS and introduce the game engine this development is based on. Third, we present the results from a first prototype testing, which we carried out with medical pro-fessionals as well as laymen in order to test game-play usability and interface. This article concludes by outlining the experimental setting of an upcoming study, which will use the mobile learning game to evaluate the influence of the game mechanism role-playing on the willingness to provide bystander CPR in case of emergency.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_28";
		pList.add(p);

		p = new PaperContent();
		p.id = "8473";
		p.type = "Short Paper";
		p.authors = "Muriel Foulonneau, Eric Ras";
		p.title = "Using Educational Domain Models in Automatic Item Generation Beyond Factual Knowledge Assessment";
		p.paperAbstract = "<p style='text-align: justify;'>The Semantic Web offers many opportunities for reusing datasets and domain models in the field of education and assessment in particular. We have conducted research to generate test questions for instance from Semantic resources. The reuse of semantic resources raises however challenges, since all data and models have not been conceived to be directly used for educational purposes. We therefore propose to analyse existing domain models created specifically for educational contexts in order to identify specific structures, relations, and boundaries of the model that can help deem the relevance of a particular domain model for automatic item generation. We present an initial set of conditions and a typology of relations which can help identify a relevant domain model to be used in an educational context.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_36";
		pList.add(p);

		p = new PaperContent();
		p.id = "8474";
		p.type = "Demo";
		p.authors = "Francisco J. García-Peñalvo, Valentina Zangrando, Alicia García-Holgado, Miguel A. Conde-González, Antonio M. Seoane-Pardo, Marc Alier, Nikolas Galanis, Jordi López, José Janssen, Francis Brouns, Anton Finders, Adriana Berlanga, Peter Sloep, Dai Griffiths";
		p.title = "A tool to aid institutions recognize their employees competences acquired by informal learning";
		p.paperAbstract = "<p style='text-align: justify;'>People do not learn only in formal educational institutions, but also throughout their lives, from their experiences, conversations, observations of others, exploration of the Internet, meetings and conferences, and chance encounters etc. However this informal and non-formal learning can easily remain largely invisible, making it hard for peers and employers to recognise or act upon it. The TRAILER project aims to make this learning visible so that it can benefit both the individual and the organisation. The proposed demonstration will show a software solution that (i) helps the learners to capture a wide range of 'informal' learning taking place in their lives, and (ii) assists the organisation and the learner in recognising this learning (to the benefit of both). This software tool has recently been used in two phases of pilot studies, which have run in four different European countries.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_56";
		pList.add(p);

		p = new PaperContent();
		p.id = "8475";
		p.type = "Poster";
		p.authors = "Róbert Horváth, Marián Šimko";
		p.title = "Augmenting the Web for Facilitating Foreign Language Vocabulary Learning";
		p.paperAbstract = "<p style='text-align: justify;'>Every day, people spend large amount of time browsing the Web while fulfilling various needs, but they find it difficult to spare some time for education. We believe the amount of documents they go through and time they spend can be used more efficiently. In our work we propose a method for web augmentation during casual web browsing, which facilitates foreign language vocabulary learning. Our method substitutes words on a webpage for their foreign equivalents and exposes a user to unknown words. Users? attention is needed for understanding the meaning of article and foreign words as well. We conducted a small qualitative experiment in order to study how user perceive word substitution in webpages and how does it affect their foreign language vocabulary. Results showed that webpage augmentation can improves user vocabulary size without negatively affecting his browsing experience.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_75";
		pList.add(p);

		p = new PaperContent();
		p.id = "8476";
		p.type = "Poster";
		p.authors = "Cecilie Hansen, Valerie EMIN, Barbara Wasson, Yishay Mor, María Jesús Rodríguez-Triana, Mihai Dascalu, Rebecca Ferguson, Jean-Philippe Pernin";
		p.title = "Towards An Integrated Model of Teacher Inquiry into Student Learning, Learning Design, and Learning Analytics";
		p.paperAbstract = "<p style='text-align: justify;'>This paper presents a first version of an integrated model of teacher inquiry into student learning, learning design, and learning analytics. The integrated model aims to capture the essence of the synergy of the three fields and to support the development of a new model of educational practice, which we call ?teacher-led design inquiry of learning?. Furthermore, we identify how learning analytics and the integrated model inform each other. We envisage that the integrated model will promote quality enhancement in education at a personal and collective level, and will be used to design better learning analytics, learning design and learning enactment tools.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_73";
		pList.add(p);

		p = new PaperContent();
		p.id = "8478";
		p.type = "Full Paper";
		p.authors = "Yishay Mor, Orit Mogilevsky";
		p.title = "The Learning Design Studio: Educational Practice as Design Inquiry of Learning";
		p.paperAbstract = "<p style='text-align: justify;'>The learning design studio is a collaborative, blended, project based framework for training educators in effective and evidence-based use of educational technology. Several decades of research produced an extensive body of scientific knowledge of effective ways to use technology to support learning. Yet, this knowledge often stays in academic realms and does not affect practice. If we want to mainstream this knowledge and use it to improve educational systems, we need to make this knowledge available to educational practitioners. Diana Laurillard (2012) argues for a view of education as a design science. While it may be unreasonable to expect practitioners to engage in full-scale scientific research, we content that they can ? and should ? adopt and adapt the principles of design research to their daily practice. We refer to this model as ?design inquiry of learning?, and propose the learning design studio as a professional training model which promotes it.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_19";
		pList.add(p);

		p = new PaperContent();
		p.id = "8479";
		p.type = "Short Paper";
		p.authors = "Yanjin Long, Vincent Aleven";
		p.title = "Can Active Learners Learn Better? Redesigning an Intelligent Tutoring System to Support Self-Regulated Learning";
		p.paperAbstract = "<p style='text-align: justify;'>Supporting students? self-regulated learning (SRL) is an important topic in the learning sciences. Two critical processes involved in SRL are self-assessment and study choice. Intelligent tutoring systems (ITSs) have been shown to be effective in supporting students? domain-level learning through guided problem-solving practice, but it is an open question how they can support SRL processes effectively, while maintaining or even enhancing their effectiveness at the domain level. We used a combination of user-centered design techniques and experimental classroom research to redesign and evaluate an ITS for linear equation solving so it supports self-assessment and study choice. We added three features to the tutor? Open Learner Model (OLM) that may scaffold students? self-assessment (self-assessment prompts, delaying the update of students? progress bars, and providing progress information on the problem type level). We also designed a problem selection screen with shared student/system control and game-like features. We went through two iterations of design and conducted two controlled experiments with 160 local middle school students to evaluate the effectiveness of the new features. The evaluations reveal that the new OLM with self-assessment support facilitates students? learning processes, and enhances their learning outcomes significantly. However, we did not find significant learning gains due to the problem selection feature. This work informs the design of future ITS that supports SRL.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_44";
		pList.add(p);

		p = new PaperContent();
		p.id = "8480";
		p.type = "Full Paper";
		p.authors = "Mika Kuuskankare, Vesa Norilo";
		p.title = "Rhythm Reading Exercises with PWGL";
		p.paperAbstract = "<p style='text-align: justify;'>This paper presents rhythmic dictation, one of the elementary ear training exercises, as a pedagogical software application of PWGL. We use different kinds of stochastic and mathematical models to generate a rhythmic database. The database is divided into several categories, such as, binary or ternary, euclidian, afro-cuban, corpus-based, and contemporary categories. Our musical constraints systems is used to define a rule set, which, in turn, can be used to automatically generate graded rhythm reading exercises. The user is then presented with a musical score, and he or she can perform a reading with any percussive instrument or voice and a microphone connected to a computer. Our novel signal processing system is utilized to analyze the reading. Finally, visual feedback and statistics are displayed directly as a part of the exercise. In this paper we present the rhythmic dictate application, and discuss the details of its implementation.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_14";
		pList.add(p);

		p = new PaperContent();
		p.id = "8481";
		p.type = "Poster";
		p.authors = "Sebastian Bab, Luise Kranich";
		p.title = "On dynamic and self-adapting recommendations of curricula for an individual technology enhanced learning experience";
		p.paperAbstract = "<p style='text-align: justify;'>Recommender systems have become important tools in today's computerized world. Today's recommender systems use collaborative or content-based filtering methods or a hybrid of both. The position of this paper is that extending the idea of recommender systems for the field of technology-enhanced learning (TEL) with a process-centric view reveals chances for a better individual-based learning and open research questions on the adaptability of these systems to the field of TEL. Existing platforms for TEL generally offer specific learning modules for certain learning purposes which are assembled in pre-defined, static courses. Although these courses are based on a concrete set of goals, they do not take into account the unique individual starting point of a user, but only a generalized virtual user profile. Especially in the case of extra-occupational education or of re-entering a job after a longer pause, TEL platforms must deal with heterogeneous previous knowledge and didactical preferences of the learners. In this paper we propose ideas for a general software architecture for the development of TEL systems which allow for an automatic, dynamic and self-adapting recommendation of curricula from a wide set of available content for an individual user with a specific interest, a specific level of knowledge and didactical preferences and with regard to a specific purpose. We argue that recommender systems in the prevalent occurrence cannot be directly used in TEL systems, but must be extended by process-related techniques for a dynamic and continuous optimization and adaptation of the generated curriculum.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8483";
		p.type = "Poster";
		p.authors = "Birgit Krogstie, Monica Divitini";
		p.title = "Reflective learning in the workplace: The role of emotion";
		p.paperAbstract = "<p style='text-align: justify;'>Emotion can be essential information about work experience, as a guide to action in the situation and as a source of insight when considering the experience in retrospect through reflective learning. Accordingly, to understand reflective learning in the workplace one should systematically consider the role of emotion. In this paper we propose to apply emotion regulation as a core concept and entry point to emotion-related aspects of work. Our main contribution is a model that conceptually refines the current understanding of reflective learning in the workplace by making explicit the role of emotion and relating it to steps in the reflective learning process. The model can be applied as a framework for analysis of cases of reflective learning in the workplace, which we demonstrate with a case from a residential care home. We discuss the relevance of the model for the integration of TEL solutions into work and learning practices.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_78";
		pList.add(p);

		p = new PaperContent();
		p.id = "8484";
		p.type = "Full Paper";
		p.authors = "Sébastien George, Elise Lavoué, Baptiste Monterrat";
		p.title = "An Environment to Support Collaborative Learning by Modding";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper, we propose an environment to support collaborative modding, as a new way to learn a subject. Modding can be defined as the activity to modify an existing game with dedicated tools. In a constructivist approach, we base our work on the assumption that modding a learning game can help learners to acquire the concepts of the subject concerned. We also think that modding in CSCL settings can help learners both to better learn the subject and to learn to collaborate. We first propose a theoretical framework to support collaborative modding activities based on four components: the game, the Game Development Kit (GDK), contextual discussions and a knowledge map. We then propose an architecture that integrates these components on a unique platform. We finally present the results of a first exploratory study that demonstrates the feasibility and the interest of this approach for learning and the need for integrating collaborative tools in a unique environment.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_10";
		pList.add(p);

		p = new PaperContent();
		p.id = "8485";
		p.type = "Poster";
		p.authors = "Nicolae Nistor, Mihai Dascalu, Stefan Trausan-Matu, Dan Mihaila, Beate Baltes, George Smeaton";
		p.title = "Virtual Communities of Practice in Academia: Automated Analysis of Collaboration Based on the Social Knowledge-Building Model";
		p.paperAbstract = "<p style='text-align: justify;'>The quality of participation in virtual communities of practice (vCoP) mainly resides in the quality of social knowledge building, which was analyzed in previous work as a cohesion-based collaboration assessment model applied to individual chat conversations. This study extends the procedure for automatically aggregating discussion threads in asynchronous text-based discussion forums. In order to validate the procedure, the computational social knowledge-building model was applied in a field study to the discussions of an academic vCoP including n = 7370 interventions from N = 179 participants. The results were compared with those obtained from a manual content analysis derived from the critical thinking framework, which resulted in a significant, positive and strong correlation (r = .72). This suggests that the proposed automated analysis procedure can assess with good accuracy the quality of the collaborative discourse in vCoP, which lays the groundwork for further analyses of vCoP processes.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_82";
		pList.add(p);

		p = new PaperContent();
		p.id = "8486";
		p.type = "Full Paper";
		p.authors = "Jose Luis Santos, Sven Charleer, Gonzalo Parra, Joris Klerkx, Erik Duval, Katrien Verbert";
		p.title = "Motivating Students in an Open Learning Environment through Open Badges";
		p.paperAbstract = "<p style='text-align: justify;'>This paper reports on our ongoing research around learning analytics. We focus on how learning analytics can be used to increase student motivation, an issue identified in our earlier research as one of the main problems students face. The context of this work is an open learning environment, based on wikis, blogs, twitter, an activity stream mash-up and an open badges system. Our evaluation analyses perceived usefulness and usability of the system, as well as the impact on student motivation. Our results indicate that badges are useful to motivate students while activity streams have the potential to activate students.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_25";
		pList.add(p);

		p = new PaperContent();
		p.id = "8487";
		p.type = "Poster";
		p.authors = "Maria Taramigkou, Fotis Paraskevopoulos, Efthimios Bothos, Dimitris Apostolou, Gregoris Mentzas";
		p.title = "Designing Computation Systems for Serendipity in Learning";
		p.paperAbstract = "<p style='text-align: justify;'>Serendipity, the process of making fortunate discoveries for which someone was not looking for, can play a crucial role in leveraging creativity in learning. Serendipity enables creative connections to develop while it can have a role in revealing hidden connections or ?hidden analogies?, especially in a social context such as in most learning processes. The results of a chance encounter can result in new ideas relevant to the learner?s previous knowledge. In this paper, we focus on serendipity as one of the key enablers under which creativity can flourish in learning. We review related literature of serendipity in physical and digital systems in order to identify factors that leverage serendipitous encounters. We use these factors to construct a framework that can be used as a guide for the development of computational systems, such as search, browse and recommender systems, that can induce serendipity in learning processes.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8488";
		p.type = "Short Paper";
		p.authors = "Thomas Cochrane, Laurent Antonczak";
		p.title = "MLEARNING: FACILITATING CONCEPTUAL SHIFTS IN PEDAGOGY";
		p.paperAbstract = "<p style='text-align: justify;'>University lecturers are usually experts within a specific context domain of knowledge, however they are seldom expert teachers or educational technology wizards. Facilitating professional development for lecturers to engage with innovation in teaching and learning utilizing new technologies is no simple process. However, we have found that structuring lecturer professional development around a sustained community of practice can result in a journey of conceptual and pedagogical transformation. The increasing ubiquity of mobile devices and social media provides a platform for enabling pedagogical change. Thus we established a community of practice of lecturers interested in researching the potential of mobile social media in education. The MOBCOP (Mobile Community Of Practice) resulted in several examples of conceptual shifts in pedagogy for the participants. We explore the MOBCOP experience, and based upon a critique of our experiences we present a framework for utilizing mobile social media as a catalyst for pedagogical change [1]. In particular we were interested in exploring the concept of the pedagogy-andragogy-heutagogy continuum [2], and how mobile learning can be utilized as a catalyst [3] to move from teacher-directed pedagogy to student-directed heutagogy. The context of the MOPCOP was a Bachelor of Graphics Design degree, with six lecturers from the department participating in a community of practice investigating the potential impact of mobile social media within their courses. The MOPCOP experience traces participants? journeys from mobile social media technophobia to mobile social media evangelists. The activity of the MOPCOP was reified in the development of a range of mobile social media projects for students, and new forms of classroom interaction using mobile social media such as live video streaming, mobile eportfolios (for example Behance), and collaborative mobile video production. The MOPCOP projects are curated at http://mobcop.wordpress.com. We argue that the MOPCOP framework is applicable to a variety of higher education contexts. REFERENCES 1. Cochrane, T., & Bateman, R. (2013). A mobile web 2.0 framework: Reconceptualizing teaching and learning. In M. Repetto & G. Trentin (Eds.), Using network and mobile technology to bridge formal and informal learning (pp. 57-92). Oxford, Cambridge: Chandos Publishing. 2. Luckin, R., Clark, W., Garnett, F., Whitworth, A., Akass, J., Cook, J., . . . Robertson, J. (2010). Learner-Generated Contexts: A Framework to Support the Effective Use of Technology for Learning. In M. Lee & C. McLoughlin (Eds.), Web 2.0-Based E-Learning: Applying Social Informatics for Tertiary Teaching (pp. 70-84). Hershey, PA: IGI Global. 3. Kukulska-Hulme, A. (2010). Mobile learning as a catalyst for change. Open Learning: The Journal of Open and Distance Learning, 25(3), 181 - 185.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_34";
		pList.add(p);

		p = new PaperContent();
		p.id = "8489";
		p.type = "Full Paper";
		p.authors = "Patricia Santos, Mara Balestrini, Valeria Righi, Josep Blat, Davinia Hernández-Leo";
		p.title = "Not interested in ICT? A case study to explore how a meaningful m-learning activity fosters engagement among older users";
		p.paperAbstract = "<p style='text-align: justify;'>Mobile devices are increasingly being used in lifelong learning. However, while older learners may be active members of the lifelong learning system, little research has been conducted to understand how m-learning technologies can be deployed to provide them with successful learning experiences. In this paper we aim to understand whether m-learning activities can foster the acceptance and uptake of mobile technologies among a group of older people unfamiliar with ICT. We followed a participatory design approach through which users co-designed a learning activity that involved the use of mobile technologies and reflected on a topic meaningful to them. We asked 20 older participants enrolled in a drop-in literature course to create routes of geolocated questions about a fiction book they were reading and to answer the questions in the real location by using a m-learning app, ?QuesTInSitu?. Qualitative and quantitative data indicates that their m-learning acceptance improved considerably as their anxiety around use of mobile technologies diminished. These findings question previous research in which use of mobile technologies tended to increase older users' anxiety and reduced their acceptance of technology. Participants reported that doing the activity in situ and interacting with the m-learning app was playful, enjoyable and useful for improving their learning related with the literature course.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_26";
		pList.add(p);

		p = new PaperContent();
		p.id = "8491";
		p.type = "Demo";
		p.authors = "Mar Perez-Sanagustin, Alejandro Martinez, Carlos Delgado Kloos";
		p.title = "etiquetAR: Tagging learning experiences";
		p.paperAbstract = "<p style='text-align: justify;'>etiquetAR is an authoring tool for supporting the design and enactment of mobile context-based learning experiences based on QR tags. etiquetAR enables creating, managing, and sharing personalized QR tags attachable to any object or physical geographical location. Tags are digital layers of contextualized information that transforms any physical space into a digitally augmented learning environment. This demonstration paper presents etiquetAR first working prototype of this application. In particular, the paper details: (1) how etiquetAR web-based application can be used to edit a tag, associate different resources to it, and relate resources information to a particular profile for adaptive learning experiences; and (2) how users can access and contribute to the information hidden in the tags using the mobile-based application. This demonstration will show the audience how etiquetAR is a simple tool designed to encourage practitioners to create their own tag-based learning experiences.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_61";
		pList.add(p);

		p = new PaperContent();
		p.id = "8492";
		p.type = "Poster";
		p.authors = "Lei Shi, Malik Awan, Alexandra Cristea";
		p.title = "A Component-Based Evaluation Framework for Social Personalized Adaptive E-Learning Systems";
		p.paperAbstract = "<p style='text-align: justify;'>Along with the theoretical and practical research on introducing social dimension into Adaptive Educational Hypermedia (AEH), the evaluation of such systems becomes more important. Existing evaluation methods are mostly based on statistical and qualitative analysis, in which researcher bias is built in and unavoidable. Moreover, they adopt either a traditional ?as a whole? approach making it difficult to evaluate a system from different perspectives, or a ?goal specified? approach which only covers a specific aspect. Therefore, this study investigates a component-based evaluation framework as an alternative. We outline the definition and usage of each component, and present a case study on using the proposed framework to evaluate a social personalized adaptive e-learning system, Topolor. We further perform a comparison with System Usability Scale (SUS) to highlight the strengths of our framework.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_87";
		pList.add(p);

		p = new PaperContent();
		p.id = "8493";
		p.type = "Full Paper";
		p.authors = "Costin-Gabriel Chiru, Traian Rebedea, Stefan Trausan-Matu";
		p.title = "Participants Assessment in CSCL Chat Conversations";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper, we present an application that can be used for assessing the contributions of participants to multiple chat conversations that debate the same topics according to different criteria, along with the ranking of the conversations considering a list of important concepts to be debated. As several factors have been used for determining the score of each participant, we needed to determine their value for providing an answer that is in accordance with the judgment of human evaluators for the same conversations. Thus, we also propose a methodology for testing the value of different factors that may be used for assessing participant in collaborative conversations in order to identify which of them are better or worst suited for providing automatic assessment.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8494";
		p.type = "Short Paper";
		p.authors = "Kairit Tammets, Mart Laanpere, Kai Pata, Tobias Ley";
		p.title = "Identifying problem-based scaffolding patterns in an online forum for construction professionals";
		p.paperAbstract = "<p style='text-align: justify;'>Online help seeking is a common form of informal learning, and it has been studied extensively in a number of different settings. In an attempt to better understand how help is provided in online help seeking for a physical work environment, we have performed an in-depth qualitative study on questions and answers found in the largest Estonian online forum for construction field. Our intention is to understand how problem-oriented scaffolding is provided and received in a networked setting. We used Jonassen?s typology for categorizing the similar patterns in problem-based learning that takes place in the forum,. Data was analysed from two perspectives: first the problem definitions identified in forum threads were analysed based on the Jonassen's typology, along with corresponding solution paths and solutions. The same discussion threads were then analysed also from the perspective of scaffolding patterns ? how people support each other and how the help is being acknowledged. The results of our analysis point out the important role of networks in scaffolding that takes place in an online forum, as opposed to traditional help seeking at the workplace. As an outcome of our study, we propose a model for monitoring and analyzing scaffolding patterns in the setting of networked learning and help seeking in an online community.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_50";
		pList.add(p);

		p = new PaperContent();
		p.id = "8495";
		p.type = "Short Paper";
		p.authors = "Johan Eliasson, Ola Knutsson, Robert Ramberg, Teresa Cerratto-Pargman";
		p.title = "Using Smartphones and QR Codes for Supporting Students in Exploring Tree Species";
		p.paperAbstract = "<p style='text-align: justify;'>Smartphones are increasingly being used on field trips to support students in exploring the natural world. In this paper we present a design and analysis of an inquiry-based learning field trip for primary school students. One problem for design is how to make use of smartphones to support, rather than distract, students in interacting with the physical environment. We approach this problem by comparing two alternative designs, where students use smartphones for identifying tree species either by using an identification instrument or by reading a text description. The results show that students made use of the instrument for identification, QR codes, for identifying tree species and made use of the text descriptions for searching for tree species. In this sense, QR codes, connecting contextual information on smartphones to the physical environment, work as a learning tool that may be used for orienting students in their interaction with the physical environment.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_35";
		pList.add(p);

		p = new PaperContent();
		p.id = "8497";
		p.type = "Full Paper";
		p.authors = "Anke Berns, Manuel Palomo-Duarte, Juan Manuel Dodero, Concepcion Valero";
		p.title = "Using a 3-D online game to assess students´ foreign language acquisition and communicative competence";
		p.paperAbstract = "<p style='text-align: justify;'>Over the past decade there has been an increasing attempt to explore the potential of computer games in order to engage students´ towards foreign language learning. However, literature review has shown that there are still few attempts to provide empiric evidence of the educational potential of computer games, whereas the present study aims to address this lack. The purpose of our paper is to explore the possibilities of using a highly interactive 3D online game, we previously designed according to our student needs, in order to reinforce their interaction and communicative competence in the target language. The target groups are students of a German foreign language course from the A1.1 level (CEFR). For our project we designed a 3D online-game that is based on a role-play, in which students need to cooperate in order to complete the game successfully. The game is built upon the OpenSim platform, and cooperation is conducted through game chats. Game chat interactions are being registered in a log file that is later processed. Furthermore, by analyzing different indicators we are able to obtain objective evidences to assess students? proficiency regarding their communicative competence in the target language. We include several examples from a pilot study we did with students of a German foreign language course (A1.1).</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_3";
		pList.add(p);

		p = new PaperContent();
		p.id = "8498";
		p.type = "Full Paper";
		p.authors = "Kai Pata, Kairit Tammets, Mart Laanpere, Vladimir Tomberg";
		p.title = "Design principles for competence management in curriculum development";
		p.paperAbstract = "<p style='text-align: justify;'>This paper discusses the ontology-based design principles for competence management in the context of curriculum development. The empirical data was collected through two participatory design experiments, which were conducted to develop and formatively evaluate the designs and scenarios for computer-supported curriculum development in higher education context. These experiments involved the use of prototypes of software tools developed in two different research projects: Intelleo and EPoAbi. As a result of the study, the paper proposes ontology-based approach to computer-supported curriculum development, course development and curriculum evaluation.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_21";
		pList.add(p);

		p = new PaperContent();
		p.id = "8499";
		p.type = "Poster";
		p.authors = "Inga Saatz, Andrea Kienle";
		p.title = "Learning with e-Flashcards ? Does it matters?";
		p.paperAbstract = "<p style='text-align: justify;'>E-Flashcards are an approach to support students for active learning and individual feedback ? even in large scale university courses. This paper presents results of a pilot study for using e-flashcards in two courses. The study shows a wide usage and acceptance of the e-flashcards, but also emphasizes further work on the organizational setting as well as the potential for technical improvements.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_85";
		pList.add(p);

		p = new PaperContent();
		p.id = "8500";
		p.type = "Poster";
		p.authors = "Davide Taibi, Giovanni Fulantelli, Stefan Dietze, Besnik Fetahu";
		p.title = "Evaluating relevance of educational resources of Social & Semantic Web";
		p.paperAbstract = "<p style='text-align: justify;'>The social environments based on the Web 2.0 paradigm have modified the way people behave on the Web. Amongst the many consequences of this change the amount of online resources directly produced and shared by users has increased considerably. For example, YouTube, Flickr, Slideshare, more and more often collect resources that can be used in educational contexts. In this scenario the importance of a method to evaluate the educational relevance of the resources raises up. In this paper we propose an approach for the evaluation of the relevance of educational resources based on recent advancements of Linked Open Data.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_89";
		pList.add(p);

		p = new PaperContent();
		p.id = "8501";
		p.type = "Full Paper";
		p.authors = "Vinicius Ramos, Paul De Bra, Geraldo Xexéo";
		p.title = "Qualitative and Quantitative Evaluation of an Adaptive Course in GALE";
		p.paperAbstract = "<p style='text-align: justify;'>Adaptive hypermedia systems, first summarized by Brusilovsky (1996 and 2001), and updated by Knutov et al (2009), are systems that build, for each user, an individual model and apply it for adapting the system to that user. A recent development in this area is the GALE system, a generic open source extensible adaptation engine. This paper presents and discusses in detail the results obtained by an evaluation of an adaptive course served by GALE. The evaluation is based on quantitative and qualitative methods. The main goal of that evaluation is to understand the influence of adaptation on students? learning in an adaptive hypertext course. We analyzed the students? logs, performed tests and assignment grade as part of the quantitative method. The student group was composed of 46 bachelor students (studying Web Science, Software Science or Psychology and Technology at the Eindhoven University of Technology). The log has a total of 17,318 entries. The qualitative method consist on the analysis of a questionnaire, where students answered about their first experience in an adaptive course. The questionnaire was answered by 28 students. Through the questionnaire, usage log, tests performed and assignment grades, we show that the students follow, in most of the cases, the adaptive structure of the course. The students who did not follow that structure are divided into three groups: students who were curious about what would happen if they followed a non-recommended link (so they played with the adaptation), students who wanted to explore what is in the course before they started studying it more carefully, and students who did not study much of the course until a few hours before the exam and who tried to quickly catch up. We also present results about how the students felt about the adaptive course, especially because the content prepared them for a later assignment (project) that started after the exam. We do not discuss that assignment in this paper. At the end we discuss future work, and in particular suggest changes to the setup and adaptation in the adaptive course based on the observed student behavior as well as the student feedback.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_24";
		pList.add(p);

		p = new PaperContent();
		p.id = "8502";
		p.type = "Poster";
		p.authors = "Frans Van Assche, Bernd Simon, Michael Aram, Jean-Noël Colin, Hoang Minh Tien, Dai Griffiths, Kris Popat, Luis Anido, Manuel Caeiro-Rodríguez, Juan Santos-Gago, Will Ellis, Joris Klerkx";
		p.title = "Re-engineering the uptake of ICT in schools";
		p.paperAbstract = "<p style='text-align: justify;'>While many innovations in Technology Enhanced Learning (TEL) have emerged over the last two decades, the uptake of these innovations has not always been very successful, particularly in schools. The transition from proof of concept to integration into learning activities has been recognized as a bottleneck for quite some time. This major problem, which is affecting many TEL stakeholders, is the focus of the four year iTEC project that is developing a comprehensive approach involving fifteen ministries of education and organizing a large scale validator with more than a thousand classrooms. This paper reports on the principles underpinning the iTEC approach, the envisaged supporting tools in general, and focuses on the key questions and current developments of iTEC technologies.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_93";
		pList.add(p);

		p = new PaperContent();
		p.id = "8503";
		p.type = "Full Paper";
		p.authors = "Andria Pavlou, Eleni A. Kyza";
		p.title = "An investigation of two methods for the technological mediation of collaborative peer feedback in higher education";
		p.paperAbstract = "<p style='text-align: justify;'>Even though several studies have examined peer feedback through synchronous and asynchronous communication within the context of distance learning, few have addressed its contribution in higher education face-to-face settings. This proposal addresses this gap by examining peer feedback mediated through synchronous and asynchronous communication in the context of a face-to-face university course. Thirty-five undergraduate students participated in this study to provide feedback to each other?s work through synchronous (chat) or asynchronous collaboration (in-context commenting). A variety of data were collected and included pre- and post-course surveys, case study videos and student interviews. The analysis of the results showed that students take advantage of the feedback they receive from their peers. As findings showed, peer feedback through asynchronous communication helped students learn, while peer feedback mediated through synchronous tools was important for interpersonal communication. Even when the feedback was not used to improve course work, students took it into serious consideration.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_22";
		pList.add(p);

		p = new PaperContent();
		p.id = "8504";
		p.type = "Short Paper";
		p.authors = "Tobias Ley, John Cook, Sebastian Dennerlein, Milos Kravcik, Christine Kunzmann, Mart Laanpere, Kai Pata, Jukka Purma, John Sandars, Patricia Santos, Andreas Schmidt";
		p.title = "Scaling Technologies for Informal Learning: A Multilevel Theoretical Analysis of Scaffolding at the Workplace";
		p.paperAbstract = "<p style='text-align: justify;'>Learning at the workplace takes place through work processes in the workplace, is multi episodic, is often informal, is problem based and takes place on a just in time basis. While this is a very effective means of delivery, it also does not scale very well beyond the immediate context. We review three types of technologies that have been suggested to scale learning: adaptive learning technologies, semantic technologies and social networking technology. Each of these addresses only a partial aspect of how informal learning is supported. To make theoretical progress, we connect the three technologies to three distinct and mostly unconnected theoretical discourses around scaffolding at the workplace, a pedagogical discourse of guidance and fading, a collective knowledge discourse on negotiating practices in communities and networks, and a cognitive discourse on representation and generation of meaning. We argue that only by means of an integrated theoretical view on scaffolding will it be possible to scale technologies for informal learning, and we suggest a first model in this direction. While the main contribution of the paper is a theoretical one, we illustrate the model with some examples from an in-depth analysis of two workplace learning domains, health care and building and construction. We close with a discussion of research questions that emerge from such a perspective.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_43";
		pList.add(p);

		p = new PaperContent();
		p.id = "8505";
		p.type = "Full Paper";
		p.authors = "Philip Meyer, Sebastian Kelle, Thomas Daniel Ullmann, Peter Scott, Fridolin Wild";
		p.title = "Interdisciplinary Cohesion of TEL. An account of multiple perspectives.";
		p.paperAbstract = "<p style='text-align: justify;'>Research areas and academic disciplines are not static: they change over time with new strands emerging and old ones disappearing. Technology-enhanced learning is a relatively young field of academic activity, getting more and more width in its scope. With the investigation at hand, we shed light on the state of interdisciplinarity in this academic community. We present selected findings of a quantitative study on mutual engagement, shared practices and methodologies, and sense of joint enterprise from the perspective of a European research network in between learning and technology disciplines. An exploratory cluster analysis helps to identify different stakeholder groups in technology-enhanced learning research and a social network analysis shows how these are connected to each other. Statistical analysis suggests that a multidisciplinary workplace and study background of researchers are major influence factors for the choice of border-crossing methodology and terminology. Additionally, results from a most recent survey on the interdisciplinary cohesion between the fields of technology-enhanced learning and educational development supports the assumption that pedagogical and technological sub-disciplines pervade each other increasingly.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_18";
		pList.add(p);

		p = new PaperContent();
		p.id = "8506";
		p.type = "Short Paper";
		p.authors = "Claudia Ribeiro, João Pereira, José Borbinha";
		p.title = "Creating Awareness of Emergency Departments Healthcare Values Using a Serious Game";
		p.paperAbstract = "<p style='text-align: justify;'>Across the board - from physicians and hospitals to health plans to pharmaceutical companies - healthcare and life-science organizations are facing challenging times. The world in which medicine and healthcare institutions are managed is rapidly changing in complex and unpredictable ways. In periods of rapid change, highly adaptive organizations have competitive advantage. The greatest impact on any healthcare organization is people who are enable by effective solutions that deliver results. A connected healthcare organization not only leverage a flexible, economical technology platform that drives results, but also focuses primarily on its greatest asset: people who are empowered to act on the right information at the right time. Training medical professionals in BPM and BPS is therefore an important activity in a healthcare organization. Providing this knowledge to the direct intervenients and decision makers could have great impacts on the current constraints of healthcare management. Recently, attention has been given to the use of Serious Games as they provide three main benefits in promoting organizational learning, namely: (i) to orient and train new employees; (ii) to select current managers or future managers; and (iii) for ongoing management training. The most important advantages of applying games in a business context, are the immediate feedback, active participation of students, learning from experience, observation of key factors in an on-the-job situation, preparation for the uncertainty of business, and the high motivation to learn created by the competitive environment. In this paper we describe the Serious Game ImPROVE, a 3D Serious Game based on the implementation of the Manchester Triage System of a Portuguese ED hospital. ImPROVE provides a player with the ability to model the business process underlying the hospital ED and check its impacts on healthcare values using the simulation features. The simulator was developed together with Information Systems specialists and is based on Time-Driven Activity-Based Costing (TDABC). The main goal of ImPROVE is to assist and enhance BPM and BPS activities in order to provide two main benefits, promote organizational learning and organizational change in healthcare contexts.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_46";
		pList.add(p);

		p = new PaperContent();
		p.id = "8508";
		p.type = "Full Paper";
		p.authors = "Gudrun Wesiak, Adam Moore, Christina Steiner, Claudia Hauff, Conor Gaffney, Declan Dagger, Dietrich Albert, Fionn Kelly, Gary Donohoe, Gordon Power, Owen Conlan";
		p.title = "Affective Metacognitive Scaffolding and User Model Augmentation for Experiential Training Simulators: A Follow-up Study";
		p.paperAbstract = "<p style='text-align: justify;'>Experiential training simulators are gaining increasing popularity and importance as learning technologies for the vocational and professional training of adults. The ImREAL project is researching how to meaningfully augment and extend these simulators. This paper presents additional work, building on last year?s report of an initial evaluation of metacognitive scaffolding for a medical interview simulation. Herein we present the results of a new cohort, engaging with an expanded simulator: Augmentation by the metacognitive scaffolding service has been refined and also extended by the incorporation of affective aspects. In addition, the simulator?s user modelling has been augmented by exploiting social digital traces as a basis for adaptation in terms of additional feedback related to learners? knowledge level. In total 152 students participated in a user trial on the updated simulator as part of their medical training curriculum at Trinity College Dublin. Data from this second user trial was compared to the results of the first user trial on the simulator with metacognitive scaffolding only (N = 143) and with the baseline evaluation results on the pure simulator (N = 131). Findings show that students perceived the learning simulator positively. The content of users? reflections recorded as notes and responses to thinking prompts provided by the affective metacognitive scaffolding service were found to be mainly reflective. Contrastingly, in the prior trials, considerably larger portions of text entries were technical or patient notes. With respect to user model augmentation based on users? digital traces students turned out to be rather reluctant to provide their open social IDs. Although students expressed trust that their personal information would not be used for other purposes than personalising simulation experience, most participants consider their social networks as private instruments used for connecting to family and friends but not for business or educational purposes. Overall, evaluation outcomes point to the usefulness of affective metacognitive scaffolding and user model augmentation for the training simulator and provide valuable information for further research.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_31";
		pList.add(p);

		p = new PaperContent();
		p.id = "8509";
		p.type = "Full Paper";
		p.authors = "Maria Claudia Buzzi, Marina Buzzi, Beatrice Rapisarda, Caterina Senette, Maurizio Tesconi";
		p.title = "Teaching Low-Functioning Children with Autism: ABCD SW";
		p.paperAbstract = "<p style='text-align: justify;'>Applied Behavior Analysis (ABA) showed its efficacy in teaching subjects with autism. We discuss the design of an open source adaptive software to support ABA intervention in low-functioning children with autism. The software automates the trial setting while enables the gathering of the children' performance data to monitor the learning. The software relies on a Web architecture: using a laptop, the tutor defines the exercises dynamically activated on the child's screen. Synchronization between devices occurs via an Internet connection, obtaining and inserting data through the database. A real-time summary of the actions performed by the child is available on the tutor?s device, simplifying decisions on the intervention. In order to make the trial accessible to any child, the software adapts the visual prompt to the child?s abilities, i.e. receptive/verbal, using labels in addition to images. A pilot test with some children confirmed the usability of the software.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_5";
		pList.add(p);

		p = new PaperContent();
		p.id = "8510";
		p.type = "Full Paper";
		p.authors = "Andreas Harrer, Kerstin Pfahler, Reuma de Groot, Rotem Abdu";
		p.title = "Research on collaborative planning and reflection ? methods and tools in the Metafora Project";
		p.paperAbstract = "<p style='text-align: justify;'>Collaboration in complex learning scenarios does not succeed automatically without structuring the learning process. In the literature there have been several means proposed to support collaborative learning: scaffolds, scripts, activity structures and reflection prompts are among these approaches. Scenarios that prompt and support reflection during the learning process proved to be effective for collaborative learning. In the Metafora project our approach is to support students in the process of learning to learn together (L2L2) by means of dedicated tools for planning and reflection. These tools allow students to organize their learning process in a self-regulated way. In this paper we will present the pedagogical background, the supporting tools and underlying design, and the research methodology used in Metafora to gain insights on how collaboration, learning, planning, and reflection interact. An extended example of qualitative analysis is given for illustration of our approach.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_12";
		pList.add(p);

		p = new PaperContent();
		p.id = "8511";
		p.type = "Full Paper";
		p.authors = "Maren Scheffel, Uwe Kirschenmann, Andreas Taske, Katja Adloff, Maik Kiesel, Roland Klemke, Martin Wolpers";
		p.title = "Exploring LogiAssist - the mobile learning and assistance platform for truck drivers";
		p.paperAbstract = "<p style='text-align: justify;'>Within the last few years mobile learning has become very popular. Many projects and case studies explore its usefulness in the educational sector, i.e. at schools and universities. Few, however, deal with work place learning. LogiAssist is an educational assistance and learning platform for truck drivers. The platform is available on the Android Market. From a requirements engineering point of view, this paper first explores how eager truck drivers are to engage in online learning and the usage of an assistance system. This is juxtaposed with first results of the actual usage of LogiAssist. In a second step, we explore how the system was used and how the usage can be interpreted from a learning analytics point of view.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_27";
		pList.add(p);

		p = new PaperContent();
		p.id = "8512";
		p.type = "Poster";
		p.authors = "Karsten Lundqvist, Guy Pursey, Shirley Williams";
		p.title = "Design and Implementation of Conversational Agents for Harvesting Feedback in eLearning Systems";
		p.paperAbstract = "<p style='text-align: justify;'>Traditionally conversational interfaces, such as chatbots, have been created in two distinct ways. Either by using natural language parsing methods or by creating conversational trees that utilise the natural Zipf curve distribution of conversations using a tool like AIML. This work describes a hybrid method where conversational trees are developed for specific types of conversations, and then through the use of a bespoke scripting language, called OwlLang, domain knowledge is extracted from semantic web ontologies. New knowledge obtained through the conversations can also be stored in the ontologies allowing an evolving knowledge base. The paper describes two experiments where this method has been used for evaluate TEL by surveying users, firstly about the experience of using a learning management system and secondly about students? experiences of an intelligent tutor system within the I-TUTOR project.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_79";
		pList.add(p);

		p = new PaperContent();
		p.id = "8513";
		p.type = "Full Paper";
		p.authors = "Katja Niemann, Martin Wolpers";
		p.title = "Usage Context for Recommender Systems in TEL";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper, we introduce a new way of detecting semantic similarities between learning objects by analyzing their usage in web portals. Our approach does not rely on the content of the learning objects or on the relations between the users and the learning objects but on usage-based relations between the objects themselves. We take this new semantic similarity measure to support existing recommendation approaches to enhance their performance.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_20";
		pList.add(p);

		p = new PaperContent();
		p.id = "8514";
		p.type = "Short Paper";
		p.authors = "Bernardo Pereira Nunes, Stella Pedrosa, Ricardo Kawase, Mohammad Alrifai, Ivana Marenzi, Stefan Dietze, Marco Antonio Casanova";
		p.title = "Answering Confucius: the reason why we complicate.";
		p.paperAbstract = "<p style='text-align: justify;'>Learning is a level-progressing process. In any field of study, one must master basic concepts to understand more complex ones. Thus, it is important that during the learning process, that learners are presented and challenged with knowledge which they are able to comprehend (not a level bellow, not a level too high). In this work we focus on language learners. By gradually improving (complicating) texts, readers are challenged to learn new vocabulary. To achieve such goals, in this paper we propose and evaluate the `complicator' that translates given sentences to a chosen level of higher degree of difficult. The `complicator' is based on natural language processing and information retrieval approaches that perform lexical replacements. We evaluate our methods with an expert-tailored dataset of children books and 30 native English speakers who participated in our user study. Results show that our tool can be of great utility for language learners who are looking for improving vocabulary.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_45";
		pList.add(p);

		p = new PaperContent();
		p.id = "8515";
		p.type = "Poster";
		p.authors = "Juan A. Muñoz-Cristóbal, Luis P. Prieto, Juan I. Asensio-Perez, Iván M. Jorrín-Abellán, Alejandra Martínez Monés, Yannis Dimitriadis";
		p.title = "Sharing the Burden: Introducing Student-Centered Orchestration in Across-Spaces Learning Situations";
		p.paperAbstract = "<p style='text-align: justify;'>Learning situations involving multiple physical and virtual spaces require considerable effort for teachers to set up. Design and automatic deployment of these situations using authoring tools may ease this burden, but normally this implies a-priori specification of the resources/tools to be used. This approach is often seen as inflexible and hampering students' agency. Nevertheless, deferring design decisions to enactment generates further orchestration problems. To enhance design flexibility and student autonomy of across-spaces learning situations without penalizing orchestration, we propose to use ?learning buckets?: containers of learning artifacts defined at design-time by teachers and filled at enactment-time by students with learning artifacts generated in multiple spaces. This allows students to create those artifacts using third-party resources/tools, and to position them within the spaces of interest. A prototype has been developed and used to deploy and simulate an illustrative scenario, as an initial proof of concept of the idea.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_81";
		pList.add(p);

		p = new PaperContent();
		p.id = "8516";
		p.type = "Short Paper";
		p.authors = "Eike M. Hirdes, Jan Marco Leimeister";
		p.title = "A Modeling Language to Describe Reusable Learning Processes to Achieve Educational Objectives in Serious Games";
		p.paperAbstract = "<p style='text-align: justify;'>Serious games combine motivational aspects of games with pedagogical approaches to enhance their players? learning performance. A major challenge in serious game development is the proper alignment of concepts coming from the two domains, game development and pedagogy. As a consequence, creating successful serious games is difficult for single individuals only well versed in one domain, but not knowing about the other. Existing approaches focus on formalizing learning processes within individual games, but are incapable of making the instructor?s knowledge reusable in other serious games. To address this issue, we present a modeling language to capture pedagogical knowledge in reusable learning processes that enable game developers to create serious games that support imparting educational objectives. As a result, our language helps game developers to integrate educational approaches into serious games. The paper illustrates the structure of the language and their first application within the area of narrative serious games.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_38";
		pList.add(p);

		p = new PaperContent();
		p.id = "8517";
		p.type = "Full Paper";
		p.authors = "Birgit Krogstie, Michael Prilla, Viktoria Pammer";
		p.title = "Understanding and Supporting Reflective Learning Processes in the Workplace: The RL@Work Model";
		p.paperAbstract = "<p style='text-align: justify;'>Reflective learning is a mechanism to turn experience into learning. As a mechanism for self-directed learning, it has been found to be critical for success at work. This is true for individual employees, but also for teams and whole organizations. However, most work on reflection can be found in educational contexts, and there is only little work regarding the connection of reflection on individual, group and organization levels. In this paper, we propose a model that can describe cases of reflective learning at work (RL@Work). The model represents reflective learning processes as intertwined learning cycles. In contrast to other models of reflective learning, the RL@Work model can de-scribe both individual and collaborative learning and learning that impacts larger parts of an organization. Furthermore, the RL@Work model provides terminology to describe and discuss different motivations for reflective learn-ing, including triggers, objectives for and objects of reflective learning. The paper illustrates how the model helps to analyse and differentiate cases of re-flective learning at work and to aid the design of tool support for such settings.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_13";
		pList.add(p);

		p = new PaperContent();
		p.id = "8518";
		p.type = "Demo";
		p.authors = "Michael Derntl, Petru Nicolaescu, Bezunesh Terkik, Ralf Klamma";
		p.title = "SynC-LD: Synchronous Collaborative IMS Learning Design Authoring on the Web";
		p.paperAbstract = "<p style='text-align: justify;'>The IMS Learning Design (LD) specification enables the formal definition of teaching and learning flows. Several IMS LD authoring tools have been developed, most of which are desktop applications. There are few authoring tools that are deployed in a browser based environment, e.g. WebCollage or CADMOS. While some of the available tools have built-in support for community use cases like sharing, publishing, retrieval, and asynchronous collaboration on the models, there are currently no tools available that enable synchronous, collaborative authoring in real-time. This demonstration presents SynC-LD, a novel widget-based tool that closes this gap. It supports collaborative visual modeling of activity flows and the definition of IMS LD elements and their attributes in the web browser. Multiple users can collaborate synchronously on the same learning design, which is achieved through inter-widget communication based on the ROLE SDK. Initial end-user trials show that the SynC-LD tool is usable and that IMS LD authors see potential in real-time IMS LD authoring.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_53";
		pList.add(p);

		p = new PaperContent();
		p.id = "8519";
		p.type = "Demo";
		p.authors = "Juan A. Muñoz-Cristóbal, Luis P. Prieto, Juan I. Asensio-Perez, Iván M. Jorrín-Abellán, Alejandra Martínez Monés, Yannis Dimitriadis";
		p.title = "GLUEPS-AR: A System for the Orchestration of Learning Situations Across Spaces Using Augmented Reality";
		p.paperAbstract = "<p style='text-align: justify;'>Ubiquitous and mobile learning scenarios define activities happening within and beyond the walls of a classroom. However, the orchestration of authentic learning situations involving both physical and virtual spaces is still a significant challenge for teachers. Several proposals recently reported in the literature try to reduce teachers' orchestration burden by means of authoring tools, and usage of Augmented Reality technologies for connecting physical and virtual spaces. However, these proposals are restricted to specific technologies, pedagogies, or to a very limited range of activities. We present GLUEPS-AR, a system to aid teachers in the orchestration of across-spaces learning situations. With GLUEPS-AR, learning designs defined with multiple authoring tools can be deployed and managed at run-time throughout ubiquitous learning environments composed by different VLEs, Web 2.0 tools and AR applications. Thus, GLUEPS-AR allows multiple design and enactment technologies, and a wide range of learning activities, not restricted to a single pedagogy.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_59";
		pList.add(p);

		p = new PaperContent();
		p.id = "8521";
		p.type = "Poster";
		p.authors = "Stefan Thalmann, Vanessa Borntrager, Tamsin Treasure-Jones, John Sandars, Ronald Maier, Kathrin Widmann, Micky Kerr";
		p.title = "Designing Scalable Informal Learning Solutions with Personas: A Pilot Study in the Healthcare Sector";
		p.paperAbstract = "<p style='text-align: justify;'>End users have unique perceptions and expectations to learning technologies in general and concerning informal learning the match with the true demands of the work environment is additionally crucial. A user-centred design approach and especially the creation of Personas, therefore, seem to be suitable for establishing and communicating a clear and rich picture of the individual informal learning needs to the designers. Based on the findings of focus group interviews with 23 interviewees in total performed in the health care sector, two Personas were created. These idealized, richly described user types performing informal learning can be used as the foundation for the design and development of supportive learning technology. We use these Personas to discuss three design ideas for scalable learning technology as we discuss the potential of using Personas to enrich requirements for scalable learning solutions.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_91";
		pList.add(p);

		p = new PaperContent();
		p.id = "8522";
		p.type = "Full Paper";
		p.authors = "Stavros Demetriadis";
		p.title = "Research evidence on the impact of technology-enhanced collaboration scripts on learning; A contribution toward a script theory of guidance in CSCL";
		p.paperAbstract = "<p style='text-align: justify;'>This work summarizes key findings of current research in the CSCL domain as a contribution to the construction of a consistent theoretical framework that encapsulates the multifaceted aspects of scripted collaboration (proposed as a ?script theory of guidance?). Based on field research evidence, four new principles are suggested and discussed, namely ?Script Appropriation?, ?Role as Script Configuration Cue?, ?Coercion on Explicitness? and ?Task to foster Transactivity? principles. The key conceptualization set forth by these principles is that: (a) learners? implementation of a script is a socially negotiated process; (b) known roles assigned to partners may have an impact on their internal script induction/configuration; (c) teachers? interventions to coerce students on being explicit and implement ?transaction fostering? tasks may have a significant impact on discourse transactivity and, therefore, on learning outcomes. These conclusions are also discussed from the perspective of system designer as guidelines toward developing more efficient technology tools for scripted collaboration.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_9";
		pList.add(p);

		p = new PaperContent();
		p.id = "8523";
		p.type = "Short Paper";
		p.authors = "Bernd Simon, Michael Aram, Frans Van Assche, Luis Anido, Manuel Caeiro-Rodríguez, David Griffiths";
		p.title = "Applying the Widget Paradigm to Learning Design: Towards a New Level of User Adoption";
		p.paperAbstract = "<p style='text-align: justify;'>Researching the sharing of learning designs is a well-established domain within the technology-enhanced learning research community. However, until now none of the tools supporting educational modelling languages such as IMS Learning Design have reached a wide adoption in today's school practice. Following a design science research methodology we report on the design, implementation, and evaluation of a novel tool referred to as Composer. The Composer supports the design of learning activities and has been developed according to design principles such as (a) interoperability between design-time and run-time environments based on the W3C Widget Standard, (b) inclusion of artefact types beyond content such as tools, people and events, (c) a user-friendly authoring environment. A first evaluation of the proof-of-concept implementation suggests that the tool is easy-to-use and provides added value for teachers when it comes to reflecting about the design of learning activities.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_49";
		pList.add(p);

		p = new PaperContent();
		p.id = "8524";
		p.type = "Short Paper";
		p.authors = "Davinia Hernández-Leo, Jonathan Chacón, Luis P. Prieto, Juan I. Asensio-Perez, Michael Derntl";
		p.title = "Towards an Integrated Learning Design Environment";
		p.paperAbstract = "<p style='text-align: justify;'>Learning design research focuses on how educators can act as designers of technology-supported learning activities according to their specific educational needs and objectives. To foster and sustain the adoption of Learning design, the METIS project is working towards the implementation of an Integrated Learning Design Environment (ILDE). This paper presents the vision for the ILDE and how user requirements from three educational institutions in vocational training, higher and adult education justify the need for this vision. The paper discusses the data collected in questionnaires, on-line interviews and face-to-face group work with the end-users, as a first phase in the design-based research methodology applied in the project. The results support a vision towards an ILDE that enables teachers to choose among multiple learning design authoring tools, (co-)produce, explore, share, evaluate and implement learning designs in Virtual Learning Environments. The paper also outlines a roadmap to achieve this vision.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_37";
		pList.add(p);

		p = new PaperContent();
		p.id = "8525";
		p.type = "Full Paper";
		p.authors = "Eloy David Villasclaras Fernandez, Mike Sharples, Simon Kelley, Eileen Scanlon";
		p.title = "Supporting Citizen Inquiry: an investigation of Moon Rock";
		p.paperAbstract = "<p style='text-align: justify;'>Citizen inquiry is an innovative way for non-professionals to engage in practical scientific activities, in which they take the role of self-regulated scientists in informal learning contexts. This type of activity has similarities to inquiry-based learning and to citizen science, but also important differences. To understand the challenges of supporting citizen inquiry, a prototype system and activity has been developed: the Moon Rock Explorer. Based on the nQuire Toolkit, this offers an open investigation for people without geology expertise into authentic specimens of Moon rock, using a virtual microscope. The Moon Rock Explorer inquiry has been evaluated in an informal learning context with PhD students from the Open University. Results of the evaluation highlight issues related to motivation and interaction between inquiry participants. They also provide evidence that the integration of scientific tools was successful and that the nQuire Toolkit is suitable to deploy and enact citizen inquiries.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_30";
		pList.add(p);

		p = new PaperContent();
		p.id = "8526";
		p.type = "Demo";
		p.authors = "Eloy David Villasclaras Fernandez, Mike Sharples, Simon Kelley, Eileen Scanlon";
		p.title = "nQuire for the OpenScience Lab: Supporting communities of inquiry learning";
		p.paperAbstract = "<p style='text-align: justify;'>We have developed a platform to support Citizen Inquiry activities, based on the nQuire Toolkit software which was originally designed to support inquiry-based learning activities for schools. Citizen Inquiry is an innovative way for learners to engage in practical scientific activities, in which they take the role of self-regulated scientists in informal learning contexts. The platform will be integrated with the OpenScience Laboratory and will allow individuals or groups to create inquiries that rely on virtual scientific instruments for collecting scientifically reliable data. A demonstration inquiry has been created using the Open University Virtual Microscope that enables learners to conduct investigations of lunar geology by studying rare and authentic samples of Moon rock collected during the Apollo programme. Inquiries created using such instruments are intended to arouse a sense of wonder in members of the public, attract learners to science, and build communities of users around non-professional yet authentic scientific activities. This demonstration will show the nQuire authoring tools and the prototype inquiry, focusing on the integration of the scientific tool and features that facilitate collaboration in citizen inquiries.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_64";
		pList.add(p);

		p = new PaperContent();
		p.id = "8527";
		p.type = "Poster";
		p.authors = "Lasse Burri Gram-Hansen, Sandra Burri Gram-Hansen, Peter Øhrstrøm";
		p.title = "From Geocaching to Mobile Persuasive Learning - Motivating the interest in the life and work of Kaj Munk";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper, some of the initial steps taken towards digital mediation of the cultural heritage related to Danish author Kaj Munk and the impact these steps have had on the ongoing research on persuasive learning within the Life Long Learning funded EU-project e-PLOT are presented and discussed. Kaj Munk was a Danish Playwright and Lutheran Pastor, who is known for his cultural engagement as well as his opposition against German occupation of Denmark during WWII. He was the vicar of Vedersø in Western Jutland, and his plays are distinguished by often having a historical background as well as a relation to specific locations. The vicarage in Vedersø has now been transformed into a museum in which the life and work of Kaj Munk can be explored by interested visitors. In order to motivate more guests to visit the museum and to clarify the significant link between literature, history and location in the area around the vicarage, ongoing research has applied Geocaching in the area as a mean to pinpoint important locations in the surroundings. So far, the results have been promising, and in particular the feedback from the 400 logs from geocachers who have visited the area has formed the basis of reflections now included in the e-PLOT project. This paper will present and evaluate the results from Vedersø, and describe how they not only influence the further development of the learning technologies included in the PLOT project, but also form the basis of a Persuasive Learning Design which will aim to motivate students in Northern Jutland?s interest in the accomplishments of Kaj Munk.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_68";
		pList.add(p);

		p = new PaperContent();
		p.id = "8528";
		p.type = "Short Paper";
		p.authors = "Karina Dyrby Kristensen";
		p.title = "A Six-Step Guide to Persuasive Learning";
		p.paperAbstract = "<p style='text-align: justify;'>By combining existing methodological approaches from Persuasive Design and Learning, this paper presents the initial version of a general guide for creating persuasive learning designs. The notion of persuasive learning designs is based on the acknowledgement that there must be an appropriate balance between context and learning technology, and that reflections regarding the context must be included throughout the design process. The understanding of context is greatly related to the rhetorical concept of Kairos, which is commonly considered a core element in persuasive design. The 6 step guide to persuasive learning springs from research conducted in the EuroPLOT project which is funded through the Life Long Learning program, however the approach aims to be generally applicable.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_42";
		pList.add(p);

		p = new PaperContent();
		p.id = "8529";
		p.type = "Poster";
		p.authors = "Françoise Greffier, Federico Tajariol";
		p.title = "A methodological proposal to design of a trace-based system to qualify cognitive features inscribed in digital learning resources";
		p.paperAbstract = "<p style='text-align: justify;'>Teachers produce more and more often Digital Learning Resources (DLR). Even if these resources could be indexed through ad hoc tools and according to specific standards (LOM, SCORM, etc.), when a teacher wants to select specific DLRs (s)he will not quickly find the best resources matching the cognitive and pedagogical needs of her/his specific learners. Our proposal is to design a trace-based system (TBS) allowing teachers to identify and choose DLRs according to some specific cognitive features, in particular the Gardner?s multiple intelligences.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_72";
		pList.add(p);

		p = new PaperContent();
		p.id = "8530";
		p.type = "Full Paper";
		p.authors = "Peter Øhrstrøm, Ulrik Sandborg-Petersen, Steinar Thorvaldsen, Thomas Ploug";
		p.title = "Teaching Logic Through Web-based and Gamified Quizzing of Formal Arguments";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper the focus is on the construction, use, paedagogical potential, and long-term sustainability of certain web-based tools designed for teaching logic. A series of web-based tools have been implemented as a two-part system, and the tools have been tested and evaluated in a number of practical experiments. The first part of the system is a student-facing Java-Applet running in the student's browser, implemented using the Prolog programming language as embodied in a Java implementation called Prolog+CG. The second part is a teacher-oriented, server-based backend for logging the progress of students. In the first section of the present paper, a discussion can be found of the paedagogical and technical ideas of construction that underpin the tools which have been made so far, as well as a brief circumscription of the problem domain of teaching logic. The second section of the paper contains an evaluation of the teaching potential of these tools in the context of university courses introducing basic logic and formal aspects of argumentation, as well as an evaluation of the ethical aspects concerning the logging of student data. This evaluation is based upon practical teaching experiences and various tests of the tools which have been carried out at Aalborg University, Denmark. In the third section of the paper it is discussed how new tools designed for teaching logic can be developed as web applications using Prolog+CG. The last section of the paper first investigates how the development of these kinds of tools for teaching logic can be carried out in a sustainable way, and then offers some concluding remarks.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_32";
		pList.add(p);

		p = new PaperContent();
		p.id = "8531";
		p.type = "Poster";
		p.authors = "Ioana Hartescu";
		p.title = "Learning instructional design in a project-based, technology-enhanced course";
		p.paperAbstract = "<p style='text-align: justify;'>By using phenomenography as a research method, the research aims to explore the different conceptions of reality that various actors (undergraduate and postgraduate students, teachers, trainers and managers in placement organizations) have in the context of two project-based learning, technology-supported courses in ?Instructional design of online courses? at the University of Bucharest.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_74";
		pList.add(p);

		p = new PaperContent();
		p.id = "8532";
		p.type = "Poster";
		p.authors = "Traian Rebedea, Gabriel Gutu";
		p.title = "How useful are semantic links for the detection of implicit references in CSCL chats?";
		p.paperAbstract = "<p style='text-align: justify;'>Chat conversations with multiple participants are widely used in solving a wide range of Computer-Supported Collaborative Learning (CSCL) tasks. One of the main reasons for their success is that they allow for creating multiple conversation threads that sometimes exist in parallel to allow multiple topics and ideas to be debated in the conversation at the same time. These threads may be detected more easily if we would be able to identify the links that exist between the utterances of a conversation. However, there is a variety of different types of links that may arise between utterances and there is no mechanism to compute them all automatically. This paper tries to explain whether semantic similarity measures used in Natural Language Processing (NLP) may be successfully used to detect the links that arise between utterances in CSCL chat conversations.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_84";
		pList.add(p);

		p = new PaperContent();
		p.id = "8534";
		p.type = "Full Paper";
		p.authors = "Michael Totschnig, Franka Grünewald, Christoph Meinel, Christian Willems";
		p.title = "Designing MOOCs for the support of multiple learning styles";
		p.paperAbstract = "<p style='text-align: justify;'>Internetworking with TCP/IP is a Massive Open Online Course, held in German at openHPI end of 2012, that attracted a large audience that has not been in contact with higher education before. The course followed the so-called xMOOC model based on a well-defined sequence of learning content, mainly video lectures and interactive self-tests, and with heavy reliance on social collaboration features. From 2726 active participants, 38% have participated in a survey at the end of the course. This paper presents an analysis of the survey responses with respect to the following questions: 1) How can a MOOC accommodate different learning styles and 2) What recommendations for the design and organization of a MOOC can be concluded from the responses? We finally give an outlook on challenges for the further development of openHPI. Those challenges are based on didactical and technical affordances for a better support of the different learning styles.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_29";
		pList.add(p);

		p = new PaperContent();
		p.id = "8535";
		p.type = "Poster";
		p.authors = "Costin-Gabriel Chiru, Traian Rebedea";
		p.title = "Detecting Discourse Creativity in Chat Conversations";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper we propose a new method for identifying creativity that is based on analyzing a corpus of chat conversations on the same topic and ex-tracting the new ideas expressed by participants. The application is a first step in supporting creativity in online group discussions by highlighting the novel concepts present in conversations (new ideas) and also by identifying topics that could have become important, but they were forgotten during the debates (lost ideas). Since group constituency might influence the level of creative discourse within a conversation, we have also tried to evaluate the typology of each participant to the conversation related to this aspect.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_69";
		pList.add(p);

		p = new PaperContent();
		p.id = "8537";
		p.type = "Short Paper";
		p.authors = "Johann Riedel, Aida Azadegan";
		p.title = "Serious Games Adoption in Organizations ? An Exploratory Analysis";
		p.paperAbstract = "<p style='text-align: justify;'>This paper arises from work ongoing in the GALA (Games and Learning Alliance ? Network of Excellence for Serious Games). As part of GALA, an exploratory set of case studies were carried out to understand the benefits, barriers and enablers of adopting serious games in companies and organizations. Serious games are games that educate, train and inform; and they have been shown to be successful as a learning method for conveying skills on complex tasks. It could therefore be expected that serious games would play an important role within corporate training, but this seems not to be the case. A methodology of exploratory case studies was adopted and five case studies of SG adoption were collected. There was use of serious games for training (three cases) and for corporate change interventions (two cases); but not for gamification. In terms of success factors all the cases showed that senior management support was critical for adoption.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_47";
		pList.add(p);

		p = new PaperContent();
		p.id = "8538";
		p.type = "Full Paper";
		p.authors = "Andrea Mazzei, Jan Blom, Louis Gomez, Pierre Dillenbourg";
		p.title = "Shared annotations: the social side of exam preparation";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper we show how the deployment of a lightweight note sharing system can restore the antique social vocation of annotations in the classroom. The system was designed for the classroom context and evaluated through a longitudinal study lasting for an academic semester and involving 20 participants, enrolled in a Master-level course in computer science. Three key findings emerged. First, the tool spontaneously became an integral part of the classroom learning practices. Students took and shared annotations during the lectures and used them as complementary preparation material for the exam. Second, a correlation was observed between the annotation browsing time and the final exam grade. Third, a social bias emerged in favor of accessing one?s own and friends' annotations. Based on the results, we discuss potential design implications for the system.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_17";
		pList.add(p);

		p = new PaperContent();
		p.id = "8540";
		p.type = "Short Paper";
		p.authors = "Andri Ioannou, Maria Christofi, Christina Vasiliou";
		p.title = "Interactive tabletops: Issues of orientation of on-display learning artifacts and asymmetric collaboration";
		p.paperAbstract = "<p style='text-align: justify;'>This paper is concerned with the exploration of an educational tabletop application designed to facilitate collaboration amongst young learners while they learn about the ?Plants of Cyprus?. The application was used by 28 third-graders during a scheduled visit at the Cyprus Center of Environmental Research and Education. We report empirical findings concerning the participants? interactions around the table as well as their attitudes regarding the activity. Findings demonstrated that the students collaborated intensively in completing the task and they were overwhelmingly positive about the experience. The paper discusses issues of orientation of the on-display learning artifacts, which encouraged learners to move at a new location around the table to ?correct? the orientation. Also, the study raises concerns regarding asymmetrical forms of collaboration, where peers dominated the activity despite the equal access on the tabletop surface.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_40";
		pList.add(p);

		p = new PaperContent();
		p.id = "8541";
		p.type = "Poster";
		p.authors = "Xi Kong, Susanne Boll, Wilko Heuten";
		p.title = "A Hybrid Multi-Recommender System for a Teaching and Learning Community for the Dual System of Vocational Education and Training";
		p.paperAbstract = "<p style='text-align: justify;'>A number of recommender systems (RS) that have been developed or are being developed in the context of technology enhanced learning. However, there seems to be a lack of research focusing on the dual system of vocational education and training (VET). The knowledge transfer and sharing in a dual system has its own particularities and difficulties. We suggest that RS can pro-actively support the knowledge transfer and sharing in the dual system and motivate learners to initialize an active lifelong learning. We propose a hybrid multi-recommender system with three types of personalized recommender, i.e. a hybrid multi-dimension article recommender, a people recommender and a knowledge-based video recommender which offers another type of learning media to motivate learners. This recommender system has been developed for the teaching and learning online community, expertAzubi.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_77";
		pList.add(p);

		p = new PaperContent();
		p.id = "8542";
		p.type = "Demo";
		p.authors = "Tania Di Mascio, Rosella Gennari, Pierpaolo Vittorini";
		p.title = "User and Evidence Based Design of Smart Games";
		p.paperAbstract = "<p style='text-align: justify;'>TERENCE is an adaptive learning system for reasoning about stories with primary-school children having deep text comprehension problems. It develops reading interventions in the form of smart games for stimulating the text comprehension of such children. In order to ensure the pedagogical effectiveness and the usability of the smart games, and of the system in general, TERENCE was designed following the user centred design (UCD) and the evidence based design (EBD). In this paper, we illustrate how the smart games were designed following the UCD and EBD, starting with the requirements, and were incrementally revised via iterative evaluations.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_54";
		pList.add(p);

		p = new PaperContent();
		p.id = "8578";
		p.type = "Demo";
		p.authors = "Javier Melero, Patricia Santos, Davinia Hernández-Leo, Josep Blat";
		p.title = "QuesTInSitu: The Game, a Mobile Application for Supporting Gamified Situated Learning Activities";
		p.paperAbstract = "<p style='text-align: justify;'>We present QuesTInSitu: The Game; an enhanced version of the former one that considers traditional puzzles and gamification strategies to improve learning in situ</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8579";
		p.type = "Demo";
		p.authors = "Lucia Pannese, Marco Pompa, Giancarlo Bo, Li Zhu";
		p.title = "Eco-dealers Game";
		p.paperAbstract = "<p style='text-align: justify;'>The increasing challenges presented by climate change and energy issues urge us to reflect upon the unsustainable lifestyle we all engage in unconsciously on a collective level. A serious game, Eco-dealers, is developed to encourage sustainable transport in urban areas by playing the issues out in a serious way.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8580";
		p.type = "Demo";
		p.authors = "David Griffiths, Kris Popat, Paul Sharples, Johnson Mark";
		p.title = "The iTEC Widget Store and Omelette OMDL: an infrastructure for extending the VLE through inter-operable Web apps";
		p.paperAbstract = "<p style='text-align: justify;'></b>When teachers&#39; work is supported by a Virtual Learning Environment (VLE) they face constraints in the tools and resources which they can use, and in the division between design-time and run-time. Web apps offer more flexible approaches to making use of the a wide range of tools and resources available on the web. The iTEC and Omelette projects have created systems for creating, managing, and deploying Web apps. These can be integrated into a wide range of Web based VLEs, and are demonstrated in Moodle. <br /><br>The demonstration will show how teachers (and, when appropriate, learners) can <br /><br>- collect describe and create Web apps<br /><br>- embed them in their courses<br /><br>- drag and resize the Web apps in tabbed pages<br /><br>- import and export pages of Web apps for use in other courses or platforms.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8581";
		p.type = "Demo";
		p.authors = "Manuel Caeiro-Rodríguez, Roberto Perez Rodrvguez, Javier Garcia Alonso, Mario Manso Vazquez, Agustvn Capas Rodriguez, Juan Santos-Gago, Luis Anido";
		p.title = "AREA, an online platform that enables the creation and sharing of iTEC learning activities.";
		p.paperAbstract = "<p style='text-align: justify;'>Technologies are more present every day in classrooms across Europe. This poses a challenge to teachers: to use all those technologies to create engaging learning activities; and that is precisely the purpose of iTEC, a FP7 EU project. In this demo we present AREA, an online platform that is targeted at teachers and that enables them to author learning activities that make use of technologies—AREA integrates an artificial intelligence agent, the SDE, that provides recommendations suited to target classrooms—as well as to create reports of their experiences and share them with others, who, in turn, may try to replicate those experiences on their own. This ongoing process of authoring, adapting, and sharing gives rise to the concept of learning activity curation.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8582";
		p.type = "Demo";
		p.authors = "Ivana Marenzi, Jaspreet Singh, Rahil Arora, Ankit Sharma, Philipp Kemkes, Sergej Zerr";
		p.title = "LearnWeb2(squared): combining web search and social networking to provide an improved collaborative learning experience";
		p.paperAbstract = "<p style='text-align: justify;'>The goal of our work is to integrate and make explicit the connections between the multiliteracies approach, the educational context, and information technology (in particular the use of LearnWeb2(squared)). In the LearnWeb2 Design Framework we show the relation between the multiliteracies pedagogical knowledge processes and the collaborative tasks provided by the LearnWeb2 system. LearnWeb2 provides users with a single platform to help them attain their learning goals. From a technical standpoint LearnWeb2 is part search engine, part social network and part repository. Conceptually, the LearnWeb2 platform can be viewed as a constellation of learning communities and courses with each course containing numerous groups.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8583";
		p.type = "Demo";
		p.authors = "Davinia Hernández-Leo, Yishay Mor, Luis P. Prieto, Michael Derntl, Juan I. Asensio-Perez, Jonathan Chacón";
		p.title = "METIS Learning Design Workshops and Integrated Environment";
		p.paperAbstract = "<p style='text-align: justify;'>The METIS project aims at fostering the adoption of learning design principles and tools by means of an integrated learning design environment (ILDE) and workshop packages for teachers’ professional development. This demo will show the ideas behind the workshop design and the first prototype of the ILDE.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8584";
		p.type = "Demo";
		p.authors = "Reinhold Behringer, Pavel Cech, Jaroslava Mikulecka, Carl Smith, Christian Grund Sorensen, Margrethe Winther-Nielsen, Nicolai Winther-Nielsen, Peter Øhrstrøm";
		p.title = "Demonstration of PLOTs from the EuroPLOT project ";
		p.paperAbstract = "<p style='text-align: justify;'>The EuroPLOT project (2010-2013) has been funded to explore the concept of persuasive design for learning and teaching. It has developed Persuasive Learn-ing Objects and Technologies (PLOTs), manifested in two tools and a set of learning objects that have been tested and evaluated in four different case studies. These PLOTs will be shown in this demonstration, and the participants can try them out and experience for themselves the impact of persuasive technology that is embedded in these PLOTs. This will be one authoring tool (PLOTMaker) and one delivery tool (PLOTLearner). Furthermore, there will be learning objects shown which have been developed for those four different case studies. All of these PLOTs have already been tested and evaluated during case studies with real learners.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8585";
		p.type = "Demo";
		p.authors = "Daire Ó Broin";
		p.title = "Towards a Sustainable Learner Mode";
		p.paperAbstract = "<p style='text-align: justify;'>Many students over-emphasise the product of a project to the detriment of learning, and this is something that continues into the workplace. This shows the need for a sustainable learner model that can be used on a day-to-day basis. The overall goal of the work is to investi- gate how learners can take a record their learning with them, over from each undergraduate course to the next and beyond into the workplace and informal learning. A prototype has been built that leverages cloud services, and a promising trial in an undergraduate course has taken place, pointing to the potential for scalability and sustainability of this learning model.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8586";
		p.type = "Poster";
		p.authors = "Patricia Santos, John Cook, Gilbert Peffer, Pablo Franzolini";
		p.title = "The Open Design Library";
		p.paperAbstract = "<p style='text-align: justify;'>The Open Design Library is created as a wiki-space (see: http://odl.learning-layers.eu/) where the Learning Layers project shares the main results from our systematic approach towards designing, developing and evaluating design interventions and solutions for complex problems in Health and Construction practices (as starting workplace contexts).</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8587";
		p.type = "Poster";
		p.authors = "Elisabetta Parodi, Fabrizio Giorgini, Marcus Specht, Simone Kopeinik, Fotini Haimala, Aristos Protopsaltis";
		p.title = "weSPOT: Working Environment with Social and Personal Open Tools for inquiry based learning";
		p.paperAbstract = "<p style='text-align: justify;'>weSPOT aims at propagating scientific inquiry as the approach for science learning and teaching in combination with today's curricula and teaching practices. The project focuses on inquiry-based learning (IBL) with a theoretically sound and technology supported personal inquiry approach. In inquiry-based learning learners take the role of an explorer and a scientist and are motivated by their personal curiosity, guided by self-reflection, and develop knowledge, personal and collaborative sense-making and reasoning. The foreseen weSPOT Toolkit gives smart support for personal scientific inquiry to address a lack of scientific inquiry skills in an age group of 12-25 via: an open source service framework for inquiry workflows, tools for mobile data collection and personal experience sampling, learning analytics tools for collaborative and personal reflection and a badge system for linking formal and informal learning activities via social media. These products will be customized and evaluated in test-beds in at least 8 European member states.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8588";
		p.type = "Poster";
		p.authors = "Fabrizio Giorgini, Edi Fanti";
		p.title = "NewsJob: Becoming Entrepreneurs! Developing New Skills for New Jobs";
		p.paperAbstract = "<p style='text-align: justify;'>One of the three priorities of the European 2020 Strategy (COM(2010) 2020) is „Inclusive growth, through an high-employment economy towards social and territorial cohesion“. In particular for the employment situation, the EU strategy has defined the aim of achieving 75% rate of employed people (age 20-64 years old) by 2020. The poster focuses on the NewsJob project aiming at the development of some key-competences (Rec.2006/962/EC) and ‘non-routine’ skills (ref. ‘New skills for New Jobs’ COM(2008) 868)) with the main aim of developing entrepreneurial and self-employment skills in over-45 unemployed people. NewsJob uses an holistic approach which take into account three aspects: the knowledge - through a blended learning approach (face-to-face training and e-learning), the skills - through internship in SMEs and attitudes - through mentoring actions. Results of the initial experimentation conducted with a large number of over-45 unemployed of Italy, Greece, UK, Latvia and Spain will be also presented.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8589";
		p.type = "Poster";
		p.authors = "Christian Grund Sorensen";
		p.title = "Immersive Layers Design - Interface Design Using Kairos";
		p.paperAbstract = "<p style='text-align: justify;'>As part of the EuroPLOT project (PLOT = Persuasive Learning Objects and Technologies) it has proven helpful to develop an interface for supporting access to a number of different digital learning objects that are available in a case focused on cultural mediation. This poster suggests that such an interface may be designed using a concept of Immersive Layers Design. This concept is designed using theories of learning, a theory of immersion, and the rhetorical concept of kairos. Designing with kairos the Immersive Layers Design features three layers of interface for providing intuitive and well categorized access to digital learning content. The interface consists of a geographical layer, a temporal layer and a conceptual layer, each of then facilitating navigation and overview. The concept of immersion is introduced in the design as metaphor for the aim of the interface.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8590";
		p.type = "Poster";
		p.authors = "Reinhold Behringer, Erich Herber, Sandra Burri Gram-Hansen, Jaroslava Mikulecka, Carl Smith, Christian Grund Sorensen, Meg Soosay, Margrethe Winther-Nielsen, Nicolai Winther-Nielsen, Peter Øhrstrøm";
		p.title = "Persuasive Technology for Learning and Teaching - The EuroPLOT Project";
		p.paperAbstract = "<p style='text-align: justify;'>The concept of persuasive design has demonstrated its benefits by changing human behavior in certain situation, but in the area of education and learning, this approach has rarely been used. To change this and to study the feasibility of per-suasive technology in teaching and learning, the EuroPLOT project (PLOT = Persuasive Learning Objects and Technologies) has been funded 2010-2013 by the Education, Audiovisual and Culture Executive Agency (EACEA) in the Life-long Learning (LLL) programme. In this program two tools have been developed (PLOTMaker and PLOTLearner) which allow to create learning objects with in-herently persuasive concepts embedded. These tools and the learning objects have been evaluated in four case studies: language learning (Ancient Hebrew), muse-um learning (Kaj Munk Museum, Denmark), chemical handling, and academic Business Computing. These case studies cover a wide range of different learning styles and learning groups, and the results obtained through the evaluation of these case studies show the wide range of success of persuasive learning. They also indicate the limitations and areas where improvements are required.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8591";
		p.type = "Short Paper";
		p.authors = "Verónica Rivera-Pelayo, Emanuel Lacic, Valentin Zacharias, Rudi Studer";
		p.title = "LIM App: Reflecting on Audience Feedback for Improving Presentation Skills";
		p.paperAbstract = "<p style='text-align: justify;'>In order to successfully give a lecture or do a presentation in a conference, the presenter needs certain skills as well as previous preparation. In such scenarios, reflective learning, i.e. learning from own experiences, offers a great potential to improve professional skills and presenter's performance, by relying on data captured during the event. For this purpose, we developed the Live Interest Meter (LIM App) which allows capturing and aggregating live feedback from the audience. It also allows sharing this feedback and its context, as well as reviewing what happened in past events. After developing the first prototype, testing it, and conducting a user study, we developed the second prototype which is presented in this paper. This further development made emphasis on the recalling and revisiting of past experiences by exploring the data collected in past presentations. We conducted the evaluation of the LIM App with three lectures held at the university. Our evaluation showed positive results regarding the capturing and sharing of feedback to improve presentation skills. Whilst lecturers could remember their presentations better and the tool guided them to reflect, they need some time and advice to get accustomed to using it so that it is optimally integrated in their presentation.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_48";
		pList.add(p);

		p = new PaperContent();
		p.id = "8593";
		p.type = "Workshop";
		p.authors = "Milos Kravcik, Birgit Krogstie, Adam Moore, Viktoria Pammer, Lucia Pannese, Michael Prilla, Wolfgang Reinhardt, Thomas Ullmann";
		p.title = "3rd International Workshop on Awareness and Reflection in Technology-Enhanced Learning";
		p.paperAbstract = "<p style='text-align: justify;'>Awareness and reflection are viewed differently across the disciplines informing Technology-Enhanced Learning (CSCW, psychology, educational sciences, computer science...). The ARTEL workshop brings together researchers and professionals from different backgrounds to provide a forum for discussing the multi-faceted area of awareness and reflection. This year workshop theme is:<br /><br/>How can awareness and reflection support learning in different settings (work, education, continuing professional development, lifelong learning, etc.). What are the roles that technology can play to support awareness and reflection in these contexts?<br /><br/>The workshop will include a paper session, a demo and prototype slam as well as an interactive session. The workshop aims at i) providing a forum for presenting and discussing research on awareness and reflection in TEL, ii) creating an interactive experience that connects participants¹ research, current tools or latest prototypes and models with real end users¹ learning experiences and requirements regarding reflection technology, and iii) creating an agenda for future ARTEL research and development.<br /><br/>This workshop is a direct follow-up of last year's ECTEL workshop <a href=http://teleurope.eu/artel12 target=_blank>ARTEL 2012</a>.<br /><br/>Find more information at the ARTEL13 workshop webpage: <a href=http://teleurope.eu/artel13 target=_blank>http://teleurope.eu/artel13</a></p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8594";
		p.type = "Workshop";
		p.authors = "Jannicke Baalsrud Hauge, Francesco Bellotti, Michael Kickmeier-Rust, Theodore Lim, Carmen Padrón-Nápoles, Wim Westra";
		p.title = "EC-TEL tutorial on Seamless assessment in Serious games ";
		p.paperAbstract = "<p style='text-align: justify;'>Seamless user performance assessment is a major topic for educational Serious Games in order to ensure that desired pedagogical goals are achieved, to provide proper feedback and support adaptivity without interrupting the player?s flow experience.  Devices and tools offering new interaction modalities that promise continuous user monitoring and assessment are available. However, the complex nature of individuality needs objective and systematic assessment of learner behavior and performance monitoring remains highly difficult.<br/>The tutorial will first explain different theoretical aspects (non-invasive assessment, framework for data-collection, learning analytics and how seamless assessment can be implemented).The second part will be practical oriented, and will demonstrate the practical use of stealth assessment: Looking firstly at two demonstrators, secondly playing a game and then analyzing the outcomes based on the learning analytic embedded in the game. Finally, the tutorial will present an approach for Services to support seamless assessment</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8595";
		p.type = "Workshop";
		p.authors = "Pythagoras Karampiperis, Dimitris Apostolou, Ilona Buchem, Isa Jahnke, Konstantinos Zachos";
		p.title = "Computational tools fostering Creativity in Learning processes ";
		p.paperAbstract = "<p style='text-align: justify;'>Learning can be viewed as a continuous iterative cycle through the processes of imagining, creating, playing, sharing and reflection. Learners develop and refine their abilities as creative thinkers. They learn to develop their own ideas, try them out, test the boundaries, experiment with alternatives, get input from others, and generate new ideas based on the feedback and their experiences. Fostering creativity in learning is increasingly seen as a key direction and focus for pedagogic approaches. Creative activity grows out of the relationship between the learner and the world of his or her educational context, as well as out of the ties between an individual and other learners. In this workshop we focus on the study, design, development and evaluation of emergent computational tools that aim to leverage creativity in learning processes.</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_90";
		pList.add(p);

		p = new PaperContent();
		p.id = "8596";
		p.type = "Workshop";
		p.authors = "Emmanuel G. Blanchard, Nick Degens, Vania Dimitrova, Sonia Hetzner, Sandy Louchart, Samuel Mascarenhas, Asad Nazir";
		p.title = "Culturally-aware technology-enhanced learning";
		p.paperAbstract = "<p style='text-align: justify;'>In today's global society, cultural awareness and tolerance of cultural diversity are paramount. This brings forth an opportunity for TEL, which can provide a broad range of examples with exposure to situations with cultural variations (e.g. in games, simulations, or online communities). However, embedding cultural aspects within TEL is a major challenge as interpretation on cultural issues can be very diverse, fluid and continuously evolving with changes in the society. There is a need to re-examine the underlying architectures and approaches currently adopted in TEL. Furthermore, new technologies (such as social media, mobile and ubiquitous computing) make it easier to share experiences and provide a rich source of cultural diversity. The time is ripe to bring together the different disciplines related to culturally-aware technology enhanced learning environments (e.g. computational modelling, virtual agents, cultural studies, communications, human computer interaction, and pedagogy) in order to shape the next generation culture-aware TEL.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8598";
		p.type = "Workshop";
		p.authors = "Miguel A. Conde-González, Francisco J. García-Peñalvo, Dai Griffiths";
		p.title = "Workshop on solutions that enhance informal learning recognition ";
		p.paperAbstract = "<p style='text-align: justify;'>The increasing presence of Web 2.0 media and tools in the workplace makes informal learning increasingly important and its recognition there becomes especially relevant since this can enhance employability, producing positive benefits for managers and companies, and give employees opportunities to learn and keep their skills up-to-date, etc. Thus, taking into account the technological and organizational innovation and the affordances of the Internet, it is necessary to define new methodologies and tools to make visible and manage this informal learning. This workshop will gather experiences about informal learning recognition, focusing on, but not limited to: validation of informal learning experiences, institutional management of informal knowledge, making use of representations of informal learning, decision making informed by informal learning experiences and using of learning analytics to document or promote informal learning.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8599";
		p.type = "Workshop";
		p.authors = "Ravi Vatrapu, Peter Reimann, Susan Bull, Andreas Breiter";
		p.title = "3rd International Workshop on Teaching Analytics";
		p.paperAbstract = "<p style='text-align: justify;'>The core problem that this workshop series on “Teaching Analytics” addresses is that in comparison with many other professionals that involve rapid decisions in a dynamically changing environment, presently teachers often do not get the data they need for decision-making in a timely fashion and in a meaningful and actionable format. Teaching Analytics as an emerging research area focuses on the design, development, evaluation, and education of visual analytics methods and tools for teachers in primary, secondary, and tertiary educational settings. Teachers’ professional practices with visual analytics methods and tools are a central concern of teaching analytics. Teaching analytics methods and tools aim to develop innovative solutions to assist and augment teachers’ dynamic decision-making in the classrooms of the 21st century. Furthermore, institutional learning can be supported by using aggregated data for decision-making in educational organizations. This can range from diagnostics, to data from standardized tests to socio-economic context data.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8600";
		p.type = "Workshop";
		p.authors = "Teresa Holocher-Ertl, Christine Kunzmann, Lars Müller, Verónica Rivera-Pelayo, Andreas P. Schmidt";
		p.title = "4th International Workshop on Motivational and Affective Aspects ";
		p.paperAbstract = "<p style='text-align: justify;'>Motivational and affective aspects are at the crossroads of various disciplines involved in technology enhanced learning, and research is scattered among them. Their importance is increasingly recognized as a decisive factor for user acceptance and sustainable success of learning solutions, both at the workplace and in formal educational contexts. This workshop intends to continue to provide an interdisciplinary forum to bring together the various perspectives and to stimulate targeted research. It builds upon three successful editions at previous EC-TEL conferences and emphasizes the interactive exchange among participants. In addition to research contributions, demos, and position statements, we will have dedicated time slots for discussion and analysis of specific topics that are suggested and described by workshop participants beforehand.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8601";
		p.type = "Workshop";
		p.authors = "Eric Ras, Mohammad AL-Smadi, Ivana Marenzi";
		p.title = "Workshop on Technology-Enhanced Formative Assessment 2013 ";
		p.paperAbstract = "<p style='text-align: justify;'>The goal of the workshop is to develop the notion of technology-enhanced formative assessment (TEFA) as a component for extending existing or new TEL approaches, further combining expertise from pedagogy, educational measurement, cognitive science, and information technology. A trend from dedicated to integrated and from sporadic to continuous formative assessment is envisioned. Challenging research questions will be addressed such as: How are established forms of formative assessment changing with the inclusion of technology and what new forms of formative assessment become possible? How is this reflected in new pedagogical approaches? How can today VLE support the provision of elaborated feedback?<br/>Position statement submissions are solicited (6 pages max. in Springer Format) that deal with approaches and innovative assessment technologies that support the transition from current assessment scenarios towards the development of e-assessment forms through which high level of meta-cognitive skills are evaluated, on-going feedback is provided, and students are more engaged in the learning process.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8602";
		p.type = "Workshop";
		p.authors = "Lucia Pannese, Michael Prilla, Declan Dagger, Zvika Popper";
		p.title = "21st century Learning in the HEALTH and EMERGENCY sectors";
		p.paperAbstract = "<p style='text-align: justify;'>The eHealth sector is one of fastest growing sector today and as such, promotes the creation of various technological solutions, all of them individually facing similar challenges and dilemmas. This workshop represents a space where Industry meets TEL projects for discussing how to concretely exploit projects? outcomes and experiences into real-world health and emergency practice and how to concretely and effectively make eHealth work. Through a discussion on concrete business scenarios and on state of the art technology solutions, together with healthcare and emergency practitioners, this workshop represents a bridge between research and market needs. Participants will reflect on sustainable solutions that guarantee a high impact in real working settings: this workshop is conceived for people creating solutions to present their work to people from practice interested in these solutions and viceversa. MIRROR, ImREAL and Rehab@Home, the supporting projects, invite 8 other projects to join and contribute with their results.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8822";
		p.type = "Keynote";
		p.authors = "John Daniel, Stamenka Uvalic-Trumbic";
		p.title = "Making Sense of MOOCs: The Evolution of Online Learning in Higher Education";
		p.paperAbstract = "<p style='text-align: justify;'>Sir John Daniel is one of the world’s most eminent practitioners and thinkers in open, distance and technology mediated learning. He has helped to progress the international development agenda in education globally and has been a distinguished leader of universities and intergovernmental organisations in Canada, France and the United Kingdom. He obtained his full-time university education in Metallurgy at the Universities of Oxford and Paris and later demonstrated his commitment to lifelong learning by taking 25 years to complete a part-time Master’s degree in Educational Technology at Concordia University. The internship for this programme, which took him to infant UK Open University in 1972, was a life-changing experience. This quest took him on an international odyssey with appointments at the Télé-université, Québec (Directeur des Études, 1973-77); Athabasca University, Alberta (Vice-President for Learning Services, 1978-80); Concordia University, Montreal (Vice-Rector, Academic, 1980-84); Laurentian University, Ontario (President, 1984-90); the UK Open University (Vice-Chancellor, 1990-2001); UNESCO, Paris (Assistant Director-General for Education, 2001-04); and the Commonwealth of Learning, Vancouver (President and CEO, 2004-2012). His non-executive appointments have included the presidencies of the International Council for Open and Distance Education, the Canadian Association for Distance Education and the Canadian Society for the Study of Higher Education. He also served as Vice-President of the International Baccalaureate Organisation and is currently Education Master with the Beijing DeTao Masters Academy, China. From 2013 he chairs the International Board of the United World Colleges (UWC). Among Sir John’s 330 publications are his books Mega-Universities and Knowledge Media: Technology Strategies for Higher Education (Kogan Page, 1996) and Mega-Schools, Technology and Teachers: Achieving Education for All (Routledge, 2010).</p>";
		p.contentlink = "http://link.springer.com/chapter/10.1007/978-3-642-40814-4_1";
		pList.add(p);

		p = new PaperContent();
		p.id = "8823";
		p.type = "Keynote";
		p.authors = "Liina Munari";
		p.title = "Beyond Horizon: learning and technology in EC policies and programming";
		p.paperAbstract = "<p style='text-align: justify;'>Liina Munari is a senior research project officer at the European Commission, DG Connect, Unit G4 Youth, Skills and Inclusion, based in Luxembourg. The unit is responsible for strategic planning, selection and monitoring of research and innovation projects in technology-enhanced learning and inclusion, funded by the 7th Framework Programme for Research (FP7) and the Competitiveness and Innovation Programme (CIP) of the European Commission. It also provides strategic policy guidance on learning and technology issues at the DG CONNECT, including Better Internet for Kids (BIK – formerly Safer Internet). Ms Munari is involved in all unit's research, innovation and policy work on technology-enhanced learning.<br/>Ms Munari has been working as an EU civil servant for her entire career since 1997. She has held various positions in different EU institutions, including the European Parliament and the EU Committee of the Regions. She joined the European Commission and the DG CONNECT (formerly DG INFSO) in 2006. Her first portfolio was on digital libraries, ICT for cultural heritage and digital preservation, and over the last years she has taken over the portfolio on learning. She holds a M.Soc.Sc in International Politics from the University of Helsinki, Finland, and a MA in European Political and Administrative Studies from the College of Europe, Bruges, Belgium.</p>";
		p.contentlink = "N/A";
		pList.add(p);

		p = new PaperContent();
		p.id = "8824";
		p.type = "Keynote";
		p.authors = "Panagiotis Kampylis, Yves Punie";
		p.title = "ICT-enabled innovation for learning in Europe and Asia - Exploring conditions for scalability and sustained impact at system level";
		p.paperAbstract = "<p style='text-align: justify;'>Educational stakeholders recognise the role of ICT as a key enabler of innovation and creativity in E&T and for learning in general. Throughout Europe there are diverse national policies for ICT in education and many activities are undertaken to promote the use of ICT in education and training in Europe. Innovating in Education and Training (E&T) is also a key priority in several flagships of the Europe 2020 Strategy, in particular the Agenda for New Skills and Jobs, Youth on the Move, the Digital Agenda, and the Innovation Union Agenda.<br/>However, it is also highlighted that the full potential of ICT is not being realised in formal education settings and major questions are arising on the sustainability, impact, costs and mainstreaming of initiatives of ICT-enabled innovation for learning in Europe and beyond.<br/>The project Up-scaling Creative Classrooms in Europe (SCALE CCR), launched by the Information Society Unit at JRC-IPTS [1] in December 2011 on behalf of the Directorate-General Education and Culture (DG EAC),  aims to provide a better understanding of ICT-enabled innovation for learning that has significant scale and/or systemic impact, to further define the concept of Creative Classrooms (CCR) and to develop a set of policy recommendations for policy and decision makers for mainstreaming of ICT-enabled innovation in Education and Training across Europe.<br/>In the context of SCALE CCR project, three cases of ICT-enabled innovation for learning from Europe (eTwinning; 1:1 Learning in Europe; and Hellerup School, Denmark) and four cases from Asia (e-Learning Pilot Scheme, Hong Kong SAR; Knowledge Construction with Technology (CoREF), Japan; Third Masterplan for ICT in Education (mp3), Singapore; and Digital Textbook project, South Korea), were analysed covering aspects such as scale and nature of innovation, learning outcomes targeted, the role of technology in the innovation, and the implementation strategies. The lessons learnt about the necessary conditions for sustainability, scalability and impact at the system level are going to be discussed bringing evidence to the debate about the mainstreaming of ICT-enabled innovation for learning in Europe and beyond.<br/>[1] The Institute for Prospective Technological Studies (IPTS) is one of the seven scientific institutes of the European Commission's Joint Research Centre (JRC). IPTS consists of five research units, one of which is the Information Society Unit.</p>";
		p.contentlink = "N/A";
		pList.add(p);



		
		return pList;
	}
	
	
	

}
