import React, { Component } from 'react';
import PDFViewer from './PDFViewer'
import PDFJSBackend from '../backends/pdfjs'

class Resume extends Component {
	render() {
		return (
			<div class='pdfContainer'>
				<PDFViewer
					backend={PDFJSBackend}
					src='/Resume.pdf'>
				</PDFViewer>
			</div>
		);
	}
}

export default Resume;
